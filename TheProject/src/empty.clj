(ns empty)

(def compositions  (ref 
 #{{:name "The Art of the Fugue" :composer "J. S. Bach" }
   {:name "Musical Offering" :composer "J. S. Bach" }
   {:name "Requiem" :composer "Giuseppe Verdi" }
   {:name "Requiem" :composer "W. A. Mozart" }}))

(def composers (ref 
#{{:composer "J. S. Bach" :country "Germany" }
  {:composer "W. A. Mozart" :country "Austria" }
  {:composer "Giuseppe Verdi" :country "Italy" }}))

(def nations (ref 
#{{:nation "Germany" :language "German" }
  {:nation "Austria" :language "German" }
  {:nation "Italy" :language "Italian" }}))

(use 'clojure.pprint); this is from clojure/pprint/print_table.clj:11

(defn printer-one-table [tbl]
(print-table @tbl) )

(printer-one-table composers)



