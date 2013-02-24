(ns partial-Database)

;;; The namespace  

(ns partial-database
  (use 'clojure.java.io)
  (with-open [wrtr (writer "/tmp/test.txt")]
  (.write wrtr "Line to be written")))
  ;( :gen-class clojure.java.io))
  ;( :import clojure.java.io 
  
        (System/getProperty "user.dir"); To see what the current directory (so ".") is. Get the absolute path
                               ; Another way is (-> (java.io.File. ".") .getAbsolutePath)

        (agent (clojure.java.io/writer
                (clojure.java.io/file "outer-file-DB.clj")
                :append true))
  
        (agent (clojure.java.io/writer
                (clojure.java.io/file "outer-file-DB.clj")))

;-----------------------------------------------------------------------  
;        
;----------------------------------------------------------------------- 

        (dosync (alter visitors conj "Stu"))
        
;-----------------------------------------------------------------------  
;        
;-----------------------------------------------------------------------  
        
;;; functional dependencies inside the table.  

(writer (file "tmp/test.txt"))

(deref (:state db))  

( {:a 8 :b 6})
(defn keys [])
(defn schema [keys attr] #{keys {attrs}}});schema a Set: collection of unique values

;-----------------------------------------------------------------------  
; Manage the database
;-----------------------------------------------------------------------  


(defn create-database [db-name])
(defn drop-database [db-name])
(defn use-database [db-name])

;;; define schema

(defn create-schema [att])

;;; define table

;; Change in an existing table

;-----------------------------------------------------------------------  
; Change in an existing table
;-----------------------------------------------------------------------  

(defn alter-table-add [table-name att val]
  (alter r conj & args))

(defn alter-table-change [table-name att val]
  (alter r update-fn & args)) 

(defn alter-table-drop [table-name att]
  (alter r update-fn & args))


;;; Domain constraints
;; Value inserted to the database must come appropriate field
(defn create-domain [domain])
(defn constrain [chech])

(def db 
   (Database.
     (ref (reduce (fn [db tx] (update tx db)) {}
                    (read-transactions
                      (clojure.java.io/file "my.db.clj"))))
     (DefaultTransactionLog. 
       (agent (clojure.java.io/writer
                (clojure.java.io/file "my.db.clj")
                :append true)))))

 
;-----------------------------------------------------------------------  
; Print the database
;-----------------------------------------------------------------------  

(defn print-table [table-name]
  "prints the table "
  (let
)

(defn print-table [table-name row-number]
  (if ("there is more") (print-table table-name row-number))
  
  
  
  
  (loop [result [] x 5]
(if (zero? x)
result
(recur (conj result x) (dec x))))
  
  
)
user> (println (format "%20s %20s %20s\n%20s %20s %20s" 
                 "short" "medium" "reallylong" 
                 "reallylong" "medium" "short")
               
(String/format "Training Week: %s Mileage: %d"
(to-array [2 26])))

;-----------------------------------------------------------------------  








