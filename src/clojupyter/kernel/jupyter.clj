(ns clojupyter.kernel.jupyter)

(def PROTOCOL-VERSION "5.3")

(def COMM-CLOSE			"comm_close")
(def COMM-INFO-REPLY		"comm_info_reply")
(def COMM-INFO-REQUEST		"comm_info_request")
(def COMM-MSG			"comm_msg")
(def COMM-OPEN			"comm_open")
(def COMPLETE-REPLY		"complete_reply")
(def COMPLETE-REQUEST		"complete_request")
(def ERROR			"error")
(def EXECUTE-INPUT		"execute_input")
(def EXECUTE-REPLY		"execute_reply")
(def EXECUTE-REQUEST		"execute_request")
(def EXECUTE-RESULT		"execute_result")
(def HISTORY-REPLY		"history_reply")
(def HISTORY-REQUEST		"history_request")
(def INPUT-REQUEST		"input_request")
(def INSPECT-REPLY		"inspect_reply")
(def INSPECT-REQUEST		"inspect_request")
(def IS-COMPLETE-REPLY		"is_complete_reply")
(def IS-COMPLETE-REQUEST	"is_complete_request")
(def KERNEL-INFO-REPLY		"kernel_info_reply")
(def KERNEL-INFO-REQUEST	"kernel_info_request")
(def SHUTDOWN-REPLY		"shutdown_reply")
(def SHUTDOWN-REQUEST		"shutdown_request")