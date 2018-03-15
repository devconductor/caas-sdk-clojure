(ns pier-sdk-clojure.api.conductor-pay
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-chave-using-post-with-http-info
  "Atualiza a chave de geração de transação
  Este método permite atualizar a chave de geração de transação de um dispositivo a partir do seu identificador (id)."
  [device-id id ]
  (call-api "/api/cartoes-tokenizados/{id}/atualizar-chave" :post
            {:path-params   {"id" id }
             :header-params {"device_id" device-id }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-chave-using-post
  "Atualiza a chave de geração de transação
  Este método permite atualizar a chave de geração de transação de um dispositivo a partir do seu identificador (id)."
  [device-id id ]
  (:data (atualizar-chave-using-post-with-http-info device-id id)))

(defn atualizar-using-put-with-http-info
  "Atualiza os dados do cartão
  Este método permite atualizar os dados do cartão tokenizados de um dispositivo a partir do seu identificador (id)."
  [device-id id update ]
  (call-api "/api/cartoes-tokenizados/{id}" :put
            {:path-params   {"id" id }
             :header-params {"device_id" device-id }
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put
  "Atualiza os dados do cartão
  Este método permite atualizar os dados do cartão tokenizados de um dispositivo a partir do seu identificador (id)."
  [device-id id update ]
  (:data (atualizar-using-put-with-http-info device-id id update)))

(defn confirma-atualizacao-chave-using-post-with-http-info
  "Confirma a atualização da chave de transação
  Este metódo recebe confirmação de atualização de chave transação."
  [device-id id update ]
  (call-api "/api/cartoes-tokenizados/{id}/confirmar-chave" :post
            {:path-params   {"id" id }
             :header-params {"device_id" device-id }
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn confirma-atualizacao-chave-using-post
  "Confirma a atualização da chave de transação
  Este metódo recebe confirmação de atualização de chave transação."
  [device-id id update ]
  (:data (confirma-atualizacao-chave-using-post-with-http-info device-id id update)))

(defn consultar-using-get8-with-http-info
  "Apresenta os dados de um determinado cartão
  Este método permite consultar as informações de um determinado cartão a partir do seu código de identificação (id)."
  [device-id id ]
  (call-api "/api/cartoes-tokenizados/{id}" :get
            {:path-params   {"id" id }
             :header-params {"device_id" device-id }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get8
  "Apresenta os dados de um determinado cartão
  Este método permite consultar as informações de um determinado cartão a partir do seu código de identificação (id)."
  [device-id id ]
  (:data (consultar-using-get8-with-http-info device-id id)))

(defn listar-codigos-resposta-using-get-with-http-info
  "Lista os códigos de resposta dos recursos de transação e consulta de conta
  Este método retorna a lista dos códigos de resposta das transações e consulta de saque realizada no Pay."
  []
  (call-api "/api/codigos-resposta" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-codigos-resposta-using-get
  "Lista os códigos de resposta dos recursos de transação e consulta de conta
  Este método retorna a lista dos códigos de resposta das transações e consulta de saque realizada no Pay."
  []
  (:data (listar-codigos-resposta-using-get-with-http-info)))

(defn listar-modos-entrada-using-get-with-http-info
  "Lista os modos entradas
  Este recurso permite listar os modos de entrada para transação"
  []
  (call-api "/api/modos-entrada" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-modos-entrada-using-get
  "Lista os modos entradas
  Este recurso permite listar os modos de entrada para transação"
  []
  (:data (listar-modos-entrada-using-get-with-http-info)))

(defn listar-operacoes-using-get-with-http-info
  "Lista as operações
  Este recurso permite listar as operações disponiveis de transação"
  []
  (call-api "/api/operacoes" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-operacoes-using-get
  "Lista as operações
  Este recurso permite listar as operações disponiveis de transação"
  []
  (:data (listar-operacoes-using-get-with-http-info)))

(defn listar-tipos-terminais-using-get-with-http-info
  "Lista os tipos de terminais
  Este método retorna a lista dos tipos de terminais."
  []
  (call-api "/api/tipos-terminais" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-tipos-terminais-using-get
  "Lista os tipos de terminais
  Este método retorna a lista dos tipos de terminais."
  []
  (:data (listar-tipos-terminais-using-get-with-http-info)))

(defn listar-tipos-transacoes-using-get-with-http-info
  "Lista os tipos de transações
  Este método retorna a lista dos tipos de transações realizadas no Pay."
  []
  (call-api "/api/tipos-transacoes" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-tipos-transacoes-using-get
  "Lista os tipos de transações
  Este método retorna a lista dos tipos de transações realizadas no Pay."
  []
  (:data (listar-tipos-transacoes-using-get-with-http-info)))

(defn listar-using-get10-with-http-info
  "Lista os cartões cadastrados
  Este método permite listar os cartões cadastrado em um dispositivo."
  ([] (listar-using-get10-with-http-info nil))
  ([{:keys [device-id sort page limit status numero-cartao ]}]
   (call-api "/api/cartoes-tokenizados" :get
             {:path-params   {}
              :header-params {"device_id" device-id }
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "status" status "numeroCartao" numero-cartao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get10
  "Lista os cartões cadastrados
  Este método permite listar os cartões cadastrado em um dispositivo."
  ([] (listar-using-get10 nil))
  ([optional-params]
   (:data (listar-using-get10-with-http-info optional-params))))

(defn salvar-using-post6-with-http-info
  "Criação de cartão
  Este metódo permite a tokenização de um cartão a partir dos seus dados impressos."
  [device-id persist ]
  (call-api "/api/cartoes-tokenizados" :post
            {:path-params   {}
             :header-params {"device_id" device-id }
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post6
  "Criação de cartão
  Este metódo permite a tokenização de um cartão a partir dos seus dados impressos."
  [device-id persist ]
  (:data (salvar-using-post6-with-http-info device-id persist)))
