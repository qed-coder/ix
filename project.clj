(defproject ix "0.1.0-SNAPSHOT"
  :description "Supreme in machine culture"
  :url "https://github.com/qed-coder/ix"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot ix.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

;; Just because I am not sure where to put this yet...
;; It will go here.

;; Start a REPL
;; 1) Open emacs
;; 2) Open profile.clj
;; 3) Press `, s i` or `, '`
;; 4) Open up the REPL buffer.
