(ns phzr.impl.accessors.loader)

(def ^:private loader-constants
  {:physics-lime-corona-json "PHYSICS_LIME_CORONA_JSON"
   :physics-phaser-json "PHYSICS_PHASER_JSON"
   :texture-atlas-json-array "TEXTURE_ATLAS_JSON_ARRAY"
   :texture-atlas-json-hash "TEXTURE_ATLAS_JSON_HASH"
   :texture-atlas-xml-starling "TEXTURE_ATLAS_XML_STARLING"})

(def loader-get-properties
  {:base-url "baseURL"
   :cross-origin "crossOrigin"
   :enable-parallel "enableParallel"
   :has-loaded "hasLoaded"
   :is-loading "isLoading"
   :on-file-complete "onFileComplete"
   :on-file-error "onFileError"
   :on-file-start "onFileStart"
   :on-load-complete "onLoadComplete"
   :on-load-start "onLoadStart"
   :on-pack-complete "onPackComplete"
   :path "path"
   :progress "progress"
   :progress-float "progressFloat"
   :reset-locked "resetLocked"
   :use-x-domain-request "useXDomainRequest"
   :with-sync-point-depth "_withSyncPointDepth"})

(def loader-set-properties
  {:base-url "baseURL"
   :cross-origin "crossOrigin"
   :enable-parallel "enableParallel"
   :has-loaded "hasLoaded"
   :is-loading "isLoading"
   :on-file-complete "onFileComplete"
   :on-file-error "onFileError"
   :on-file-start "onFileStart"
   :on-load-complete "onLoadComplete"
   :on-load-start "onLoadStart"
   :on-pack-complete "onPackComplete"
   :path "path"
   :progress "progress"
   :progress-float "progressFloat"
   :reset-locked "resetLocked"
   :use-x-domain-request "useXDomainRequest"
   :with-sync-point-depth "_withSyncPointDepth"})