(ns status-im.ui.screens.wallet.styles
  (:require-macros [status-im.utils.styles :refer [defstyle]])
  (:require [status-im.ui.components.colors :as colors]
            [status-im.ui.components.styles :as styles]))

;; errors

(defstyle error-container
  {:align-self       :center
   :justify-content  :center
   :ios              {:border-radius 20
                      :margin-top    6}
   :android          {:border-radius 4
                      :margin-top    18}
   :background-color colors/blue})

(defstyle error-message-container
  {:flex-direction     :row
   :align-items        :center
   :padding-horizontal 15
   :ios                {:padding-vertical 8}
   :android            {:padding-vertical 10}})


(defn exclamation [color]
  {:background-color color
   :border-radius    100
   :width            16
   :height           16
   :margin-right     6})

(def error-message
  {:color         colors/white
   :font-size     13})

(def error-exclamation
  (exclamation styles/color-red-2))

(def warning-exclamation
  (exclamation :gold))

;; wallet

(def wallet-container
  {:flex 1})

(defstyle toolbar
  {:background-color colors/blue
   :android          {:elevation 0}})

(def buttons-container
  {:flex-direction :row
   :align-items    :center})

(def button
  {:padding-vertical   15
   :padding-horizontal 12})

(def forward-icon-container
  {:margin-left 8})

(defn button-container [enabled?]
  (merge {:flex-direction :row
          :align-items    :center}
         (when-not enabled?
           {:opacity 0.4})))

(def wallet-modal-container
  {:flex             1
   :background-color colors/blue})

(def choose-participant-container
  {:margin-top        16
   :margin-horizontal 15})

(def amount-container
  {:margin-top        16
   :margin-bottom     16
   :margin-horizontal 15
   :flex-direction    :row})

(def choose-asset-container
  {:margin-top        16
   :margin-horizontal 15})
