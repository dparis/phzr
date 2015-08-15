(ns phzr.video
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Video
  "A Video object that takes a previously loaded Video from the Phaser Cache and handles playback of it.

  Alternatively it takes a getUserMedia feed from an active webcam and streams the contents of that to
  the Video instead (see `startMediaStream` method)

  The video can then be applied to a Sprite as a texture. If multiple Sprites share the same Video texture and playback
  changes (i.e. you pause the video, or seek to a new time) then this change will be seen across all Sprites simultaneously.

  Due to a bug in IE11 you cannot play a video texture to a Sprite in WebGL. For IE11 force Canvas mode.

  If you need each Sprite to be able to play a video fully independently then you will need one Video object per Sprite.
  Please understand the obvious performance implications of doing this, and the memory required to hold videos in RAM.

  On some mobile browsers such as iOS Safari, you cannot play a video until the user has explicitly touched the screen.
  This works in the same way as audio unlocking. Phaser will handle the touch unlocking for you, however unlike with audio
  it's worth noting that every single Video needs to be touch unlocked, not just the first one. You can use the `changeSource`
  method to try and work around this limitation, but see the method help for details.

  Small screen devices, especially iPod and iPhone will launch the video in its own native video player, 
  outside of the Safari browser. There is no way to avoid this, it's a device imposed limitation.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * key (string | null) {optional} - The key of the video file in the Phaser.Cache that this Video object will play. Set to `null` or leave undefined if you wish to use a webcam as the source. See `startMediaStream` to start webcam capture.
    * url (string | null) {optional} - If the video hasn't been loaded then you can provide a full URL to the file here (make sure to set key to null)"
  ([game]
   (js/Phaser.Video. (clj->phaser game)))
  ([game key]
   (js/Phaser.Video. (clj->phaser game)
                     (clj->phaser key)))
  ([game key url]
   (js/Phaser.Video. (clj->phaser game)
                     (clj->phaser key)
                     (clj->phaser url))))

(defn add
  "Updates the given Display Objects so they use this Video as their texture.
  This will replace any texture they will currently have set.

  Parameters:
    * video (Phaser.Video) - Targeted instance for method
    * object (Phaser.Sprite | Array.<Phaser.Sprite> | Phaser.Image | Array.<Phaser.Image>) - Either a single Sprite/Image or an Array of Sprites/Images.

  Returns:  Phaser.Video - This Video object for method chaining."
  ([video object]
   (phaser->clj
    (.add video
          (clj->phaser object)))))

(defn add-to-world
  "Creates a new Phaser.Image object, assigns this Video to be its texture, adds it to the world then returns it.

  Parameters:
    * video (Phaser.Video) - Targeted instance for method
    * x (number) {optional} - The x coordinate to place the Image at.
    * y (number) {optional} - The y coordinate to place the Image at.
    * anchor-x (number) {optional} - Set the x anchor point of the Image. A value between 0 and 1, where 0 is the top-left and 1 is bottom-right.
    * anchor-y (number) {optional} - Set the y anchor point of the Image. A value between 0 and 1, where 0 is the top-left and 1 is bottom-right.
    * scale-x (number) {optional} - The horizontal scale factor of the Image. A value of 1 means no scaling. 2 would be twice the size, and so on.
    * scale-y (number) {optional} - The vertical scale factor of the Image. A value of 1 means no scaling. 2 would be twice the size, and so on.

  Returns:  Phaser.Image - The newly added Image object."
  ([video]
   (phaser->clj
    (.addToWorld video)))
  ([video x]
   (phaser->clj
    (.addToWorld video
                 (clj->phaser x))))
  ([video x y]
   (phaser->clj
    (.addToWorld video
                 (clj->phaser x)
                 (clj->phaser y))))
  ([video x y anchor-x]
   (phaser->clj
    (.addToWorld video
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser anchor-x))))
  ([video x y anchor-x anchor-y]
   (phaser->clj
    (.addToWorld video
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser anchor-x)
                 (clj->phaser anchor-y))))
  ([video x y anchor-x anchor-y scale-x]
   (phaser->clj
    (.addToWorld video
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser anchor-x)
                 (clj->phaser anchor-y)
                 (clj->phaser scale-x))))
  ([video x y anchor-x anchor-y scale-x scale-y]
   (phaser->clj
    (.addToWorld video
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser anchor-x)
                 (clj->phaser anchor-y)
                 (clj->phaser scale-x)
                 (clj->phaser scale-y)))))

(defn change-source
  "On some mobile browsers you cannot play a video until the user has explicitly touched the video to allow it.
  Phaser handles this via the `setTouchLock` method. However if you have 3 different videos, maybe an 'Intro', 'Start' and 'Game Over'
  split into three different Video objects, then you will need the user to touch-unlock every single one of them.

  You can avoid this by using just one Video object and simply changing the video source. Once a Video element is unlocked it remains
  unlocked, even if the source changes. So you can use this to your benefit to avoid forcing the user to 'touch' the video yet again.

  As you'd expect there are limitations. So far we've found that the videos need to be in the same encoding format and bitrate.
  This method will automatically handle a change in video dimensions, but if you try swapping to a different bitrate we've found it
  cannot render the new video on iOS (desktop browsers cope better).

  When the video source is changed the video file is requested over the network. Listen for the `onChangeSource` signal to know
  when the new video has downloaded enough content to be able to be played. Previous settings such as the volume and loop state
  are adopted automatically by the new video.

  Parameters:
    * video (Phaser.Video) - Targeted instance for method
    * src (string) - The new URL to change the video.src to.
    * autoplay (boolean) {optional} - Should the video play automatically after the source has been updated?

  Returns:  Phaser.Video - This Video object for method chaining."
  ([video src]
   (phaser->clj
    (.changeSource video
                   (clj->phaser src))))
  ([video src autoplay]
   (phaser->clj
    (.changeSource video
                   (clj->phaser src)
                   (clj->phaser autoplay)))))

(defn complete
  "Called when the video completes playback (reaches and ended state).
  Dispatches the Video.onComplete signal."
  ([video]
   (phaser->clj
    (.complete video))))

(defn connect-to-media-stream
  "Connects to an external media stream for the webcam, rather than using a local one.

  Parameters:
    * video (Phaser.Video) - Targeted instance for method
    * video (HTMLVideoElement) - The HTML Video Element that the stream uses.
    * stream (MediaStream) - The Video Stream data.

  Returns:  Phaser.Video - This Video object for method chaining."
  ([video video stream]
   (phaser->clj
    (.connectToMediaStream video
                           (clj->phaser video)
                           (clj->phaser stream)))))

(defn create-video-from-blob
  "Creates a new Video element from the given Blob. The Blob must contain the video data in the correct encoded format.
  This method is typically called by the Phaser.Loader and Phaser.Cache for you, but is exposed publicly for convenience.

  Parameters:
    * video (Phaser.Video) - Targeted instance for method
    * blob (Blob) - The Blob containing the video data: `Blob([new Uint8Array(data)])`

  Returns:  Phaser.Video - This Video object for method chaining."
  ([video blob]
   (phaser->clj
    (.createVideoFromBlob video
                          (clj->phaser blob)))))

(defn create-video-from-url
  "Creates a new Video element from the given URL.

  Parameters:
    * video (Phaser.Video) - Targeted instance for method
    * url (string) - The URL of the video.
    * autoplay (boolean) {optional} - Automatically start the video?

  Returns:  Phaser.Video - This Video object for method chaining."
  ([video url]
   (phaser->clj
    (.createVideoFromURL video
                         (clj->phaser url))))
  ([video url autoplay]
   (phaser->clj
    (.createVideoFromURL video
                         (clj->phaser url)
                         (clj->phaser autoplay)))))

(defn destroy
  "Destroys the Video object. This calls `Video.stop` and then `Video.removeVideoElement`.
  If any Sprites are using this Video as their texture it is up to you to manage those."
  ([video]
   (phaser->clj
    (.destroy video))))

(defn grab
  "Grabs the current frame from the Video or Video Stream and renders it to the Video.snapshot BitmapData.

  You can optionally set if the BitmapData should be cleared or not, the alpha and the blend mode of the draw.

  If you need more advanced control over the grabbing them call `Video.snapshot.copy` directly with the same parameters as BitmapData.copy.

  Parameters:
    * video (Phaser.Video) - Targeted instance for method
    * clear (boolean) {optional} - Should the BitmapData be cleared before the Video is grabbed? Unless you are using alpha or a blend mode you can usually leave this set to false.
    * alpha (number) {optional} - The alpha that will be set on the video before drawing. A value between 0 (fully transparent) and 1, opaque.
    * blend-mode (string) {optional} - The composite blend mode that will be used when drawing. The default is no blend mode at all. This is a Canvas globalCompositeOperation value such as 'lighter' or 'xor'.

  Returns:  Phaser.BitmapData - A reference to the Video.snapshot BitmapData object for further method chaining."
  ([video]
   (phaser->clj
    (.grab video)))
  ([video clear]
   (phaser->clj
    (.grab video
           (clj->phaser clear))))
  ([video clear alpha]
   (phaser->clj
    (.grab video
           (clj->phaser clear)
           (clj->phaser alpha))))
  ([video clear alpha blend-mode]
   (phaser->clj
    (.grab video
           (clj->phaser clear)
           (clj->phaser alpha)
           (clj->phaser blend-mode)))))

(defn play
  "Starts this video playing if it's not already doing so.

  Parameters:
    * video (Phaser.Video) - Targeted instance for method
    * loop (boolean) {optional} - Should the video loop automatically when it reaches the end? Please note that at present some browsers (i.e. Chrome) do not support *seamless* video looping.
    * playback-rate (number) {optional} - The playback rate of the video. 1 is normal speed, 2 is x2 speed, and so on. You cannot set a negative playback rate.

  Returns:  Phaser.Video - This Video object for method chaining."
  ([video]
   (phaser->clj
    (.play video)))
  ([video loop]
   (phaser->clj
    (.play video
           (clj->phaser loop))))
  ([video loop playback-rate]
   (phaser->clj
    (.play video
           (clj->phaser loop)
           (clj->phaser playback-rate)))))

(defn remove-video-element
  "Removes the Video element from the DOM by calling parentNode.removeChild on itself.
  Also removes the autoplay and src attributes and nulls the reference."
  ([video]
   (phaser->clj
    (.removeVideoElement video))))

(defn render
  "If the game is running in WebGL this will push the texture up to the GPU if it's dirty.
  This is called automatically if the Video is being used by a Sprite, otherwise you need to remember to call it in your render function.
  If you wish to suppress this functionality set Video.disableTextureUpload to `true`."
  ([video]
   (phaser->clj
    (.render video))))

(defn set-touch-lock
  "Sets the Input Manager touch callback to be Video.unlock.
  Required for mobile video unlocking. Mostly just used internally."
  ([video]
   (phaser->clj
    (.setTouchLock video))))

(defn start-media-stream
  "Instead of playing a video file this method allows you to stream video data from an attached webcam.

  As soon as this method is called the user will be prompted by their browser to 'Allow' access to the webcam.
  If they allow it the webcam feed is directed to this Video. Call `Video.play` to start the stream.

  If they block the webcam the onError signal will be dispatched containing the NavigatorUserMediaError
  or MediaStreamError event.

  You can optionally set a width and height for the stream. If set the input will be cropped to these dimensions.
  If not given then as soon as the stream has enough data the video dimensions will be changed to match the webcam device.
  You can listen for this with the onChangeSource signal.

  Parameters:
    * video (Phaser.Video) - Targeted instance for method
    * capture-audio (boolean) {optional} - Controls if audio should be captured along with video in the video stream.
    * width (integer) {optional} - The width is used to create the video stream. If not provided the video width will be set to the width of the webcam input source.
    * height (integer) {optional} - The height is used to create the video stream. If not provided the video height will be set to the height of the webcam input source.

  Returns:  Phaser.Video - This Video object for method chaining or false if the device doesn't support getUserMedia."
  ([video]
   (phaser->clj
    (.startMediaStream video)))
  ([video capture-audio]
   (phaser->clj
    (.startMediaStream video
                       (clj->phaser capture-audio))))
  ([video capture-audio width]
   (phaser->clj
    (.startMediaStream video
                       (clj->phaser capture-audio)
                       (clj->phaser width))))
  ([video capture-audio width height]
   (phaser->clj
    (.startMediaStream video
                       (clj->phaser capture-audio)
                       (clj->phaser width)
                       (clj->phaser height)))))

(defn stop
  "Stops the video playing.

  This removes all locally set signals.

  If you only wish to pause playback of the video, to resume at a later time, use `Video.paused = true` instead.
  If the video hasn't finished downloading calling `Video.stop` will not abort the download. To do that you need to 
  call `Video.destroy` instead.

  If you are using a video stream from a webcam then calling Stop will disconnect the MediaStream session and disable the webcam.

  Returns:  Phaser.Video - This Video object for method chaining."
  ([video]
   (phaser->clj
    (.stop video))))

(defn unlock
  "Enables the video on mobile devices, usually after the first touch.
  If the SoundManager hasn't been unlocked then this will automatically unlock that as well.
  Only one video can be pending unlock at any one time."
  ([video]
   (phaser->clj
    (.unlock video))))

(defn update-texture
  "Called automatically if the video source changes and updates the internal texture dimensions.
  Then dispatches the onChangeSource signal.

  Parameters:
    * video (Phaser.Video) - Targeted instance for method
    * event (object) {optional} - The event which triggered the texture update.
    * width (integer) {optional} - The new width of the video. If undefined `video.videoWidth` is used.
    * height (integer) {optional} - The new height of the video. If undefined `video.videoHeight` is used."
  ([video]
   (phaser->clj
    (.updateTexture video)))
  ([video event]
   (phaser->clj
    (.updateTexture video
                    (clj->phaser event))))
  ([video event width]
   (phaser->clj
    (.updateTexture video
                    (clj->phaser event)
                    (clj->phaser width))))
  ([video event width height]
   (phaser->clj
    (.updateTexture video
                    (clj->phaser event)
                    (clj->phaser width)
                    (clj->phaser height)))))