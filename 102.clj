;; Problem 102, intoCamelCase
(fn [s]
  (let [[w0 & ws] (clojure.string/split s #"-")]
    (apply str (cons w0 (map clojure.string/capitalize ws))))))
