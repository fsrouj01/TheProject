(ns empty)

(def compositions 
 #{{:name "The Art of the Fugue" :composer "J. S. Bach" }
   {:name "Musical Offering" :composer "J. S. Bach" }
   {:name "Requiem" :composer "Giuseppe Verdi" }
   {:name "Requiem" :composer "W. A. Mozart" }})


(def composers
#{{:composer "J. S. Bach" :country "Germany" }
  {:composer "W. A. Mozart" :country "Austria" }
  {:composer "Giuseppe Verdi" :country "Italy" }})

(def nations
#{{:nation "Germany" :language "German" }
  {:nation "Austria" :language "German" }
  {:nation "Italy" :language "Italian" }})


(use 'clojure.pprint 'clojure.reflect)
; this is from clojure/pprint/print_table.clj:11

(defn printer-one-table [table-name]
(def tbl (ref table-name))
(print-table @tbl) )

(printer-one-table composers)
