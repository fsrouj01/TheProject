(ns partial-Database
  (:require clojure.lang.ISeq.))
;(:require clojure.contrib.sql)

;;;;;;;; draft file ;;;;;;;;;

;=======================================================================
; Create a transaction?
;=======================================================================
 
(def tables (ref #{}))

(dosync & db); Use ref to create a reference, and use def to bind this reference to the name tables
        
(dosync (alter tables conj "Stu"))

;(def tables (ref #{}))

;=======================================================================
; To make a reference to the table ?
;=======================================================================

(def tables (ref #{}))
@ tables     
(dosync (alter tables conj "Stu"))
@tables
     
;=======================================================================
; Functional dependencies inside the table        
;=======================================================================
       
(let [])

;=======================================================================
; Manage the database
;=======================================================================

(defn create-database 
  "Returns a database constructed from the tables inputed"
  [db-name tables])

(defn drop-database [db-name])

(defn use-database [db-name])

;=======================================================================
; Change in an existing table
;=======================================================================

(defn alter-table-add [table-name col]
  (cons table-name col))

(defn alter-table-change [table-name att val]
  (alter r update-fn & args)) 

(defn alter-table-drop [table-name att]
  (alter r update-fn & args))

(assoc nations :state "NC")
;;; Domain constraints
;; Value inserted to the database must come appropriate field
(defn create-domain [domain])
(defn constrain [chech])

;=======================================================================
; SQL oerations we define on tables. 
;=======================================================================

;; Union two tables
(defn union-tables [table1 table2] (conj table1 table2)) 

;; difference two tables
(defn difference-tables composers nations)

;; intersection two tables
(defn intersection-tables languages beverages)

;; select columns
(defn select #(= 1 (.length %)) languages)

;; where rows
(defn where #(= 1 (.length %)) languages)

;; from tables. cartesian multiplication on tables
(defn from #(= 1 (.length %)) languages)

;; join two tables
(defn join compositions composers)
 
;=======================================================================
; Get table as a string for printing
;=======================================================================

(defn #^Set get-str-table [#^String c]); expects a set and returns a string. #^String = #^{:tag String}
(defn #^{:tag String} shout [#^{:tag String} s] (.toUpperCase s))
(shout "")

;=======================================================================
; Print the database
;=======================================================================

(defn print-table [table-name]
  (loop [result [] x 5] 
      (if (zero? x)
          result
          (recur (conj result x) (dec x)))))
    


(defn indexed [coll] (map vector (iterate inc 0) coll));(indexed "abcde") ([0 \a] [1 \b] [2 \c] [3 \d] [4 \e])

(println (format "%20s %20s %20s\n%20s %20s %20s" 
                 "short" "medium" "reallylong" 
                 "reallylong" "medium" "short")
               
(String/format "Training Week: %s Mileage: %d"
(to-array [2 26])))

;-----------------------------------------------------------------------  
; taken from the internet and modified to our need:
;-----------------------------------------------------------------------  

(defn print-table [table-name]
  "prints the table "
  (let [table-ref (get (deref data-base) table-name) ; get refrence for table
        keyList (keys @tableRef)] ; get key list of table
    (doseq [tableKeys (range (count keyList))] ; print the keys of the table
      (let [key (nth (keys @tableRef) tableKeys)]
        (print key "\t|")))
    (println(format  "%-20s %-20s %-20s\n%-20s %-20s %-20s"))
    (doseq [rows (range (count @(tableRef (nth (keys @tableRef) 0))))] ; print for each rows all the values
      (doseq [cols (range (count keyList))]
        (let [key (nth (keys @tableRef) cols)]
          (print (@(tableRef key) rows) "\t|")))
      (println(format "%-20s %-20s %-20s\n%-20s %-20s %-20s"))))
  (println))

;------------------------- make and thern write to txt file ----------------------------

(agent (clojure.java.io/writer
       (clojure.java.io/file "output-tables.txt")
                :append true))
    

(file (str (System/getProperty "user.dir")"\\mytable.txt"))
                
   
(System/getProperty "user.dir"); To see what the current directory (so ".") is. Get the absolute path
                               ; Another way is (-> (java.io.File. ".") .getAbsolutePath)
(-> (java.io.File. ".") .getAbsolutePath)

(use 'clojure.java.io)
(with-open [wrtr (writer "/tmp/test.txt")]
  (.write wrtr "Line to be written"))


