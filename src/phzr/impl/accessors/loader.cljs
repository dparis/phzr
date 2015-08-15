(ns phzr.impl.accessors.loader)

(def ^:private loader-constants
  {:texture-atlas-json-array "TEXTURE_ATLAS_JSON_ARRAY"
   :texture-atlas-json-hash "TEXTURE_ATLAS_JSON_HASH"
   :texture-atlas-xml-starling "TEXTURE_ATLAS_XML_STARLING"
   :physics-lime-corona-json "PHYSICS_LIME_CORONA_JSON"
   :physics-phaser-json "PHYSICS_PHASER_JSON"})

(def loader-get-properties
  {:path "path"
   :has-loaded "hasLoaded"
   :on-pack-complete "onPackComplete"
   :reset-locked "resetLocked"
   :is-loading "isLoading"
   :use-x-domain-request "useXDomainRequest"
   :on-file-error "onFileError"
   :progress-float "progressFloat"
   :base-url "baseURL"
   :on-load-start "onLoadStart"
   :on-file-complete "onFileComplete"
   :with-sync-point-depth "_withSyncPointDepth"
   :cross-origin "crossOrigin"
   :enable-parallel "enableParallel"
   :on-file-start "onFileStart"
   :on-load-complete "onLoadComplete"
   :progress "progress"})

(def loader-set-properties
  {:path "path"
   :has-loaded "hasLoaded"
   :on-pack-complete "onPackComplete"
   :reset-locked "resetLocked"
   :is-loading "isLoading"
   :use-x-domain-request "useXDomainRequest"
   :on-file-error "onFileError"
   :progress-float "progressFloat"
   :base-url "baseURL"
   :on-load-start "onLoadStart"
   :on-file-complete "onFileComplete"
   :with-sync-point-depth "_withSyncPointDepth"
   :cross-origin "crossOrigin"
   :enable-parallel "enableParallel"
   :on-file-start "onFileStart"
   :on-load-complete "onLoadComplete"
   :progress "progress"})