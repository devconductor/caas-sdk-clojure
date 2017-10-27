(ns pier-sdk-clojure.api.conductor-pay
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-chave-using-post-with-http-info
  "Atualiza a chave de geraÃ§Ã£o de transaÃ§Ã£o
  Este mÃ©todo permite atualizar a chave de geraÃ§Ã£o de transaÃ§Ã£o de um dispositivo a partir do seu identificador (id)."
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
  "Atualiza a chave de geraÃ§Ã£o de transaÃ§Ã£o
  Este mÃ©todo permite atualizar a chave de geraÃ§Ã£o de transaÃ§Ã£o de um dispositivo a partir do seu identificador (id)."
  [device-id id ]
  (:data (atualizar-chave-using-post-with-http-info device-id id)))

(defn atualizar-using-put-with-http-info
  "Atualiza os dados do cartÃ£o
  Este mÃ©todo permite atualizar os dados do cartÃ£o tokenizados de um dispositivo a partir do seu identificador (id)."
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
  "Atualiza os dados do cartÃ£o
  Este mÃ©todo permite atualizar os dados do cartÃ£o tokenizados de um dispositivo a partir do seu identificador (id)."
  [device-id id update ]
  (:data (atualizar-using-put-with-http-info device-id id update)))

(defn confirma-atualizacao-chave-using-post-with-http-info
  "Confirma a atualizaÃ§Ã£o da chave de transaÃ§Ã£o
  Este metÃ³do recebe confirmaÃ§Ã£o de atualizaÃ§Ã£o de chave transaÃ§Ã£o."
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
  "Confirma a atualizaÃ§Ã£o da chave de transaÃ§Ã£o
  Este metÃ³do recebe confirmaÃ§Ã£o de atualizaÃ§Ã£o de chave transaÃ§Ã£o."
  [device-id id update ]
  (:data (confirma-atualizacao-chave-using-post-with-http-info device-id id update)))

(defn consultar-using-get5-with-http-info
  "Apresenta os dados de um determinado cartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [device-id id ]
  (call-api "/api/cartoes-tokenizados/{id}" :get
            {:path-params   {"id" id }
             :header-params {"device_id" device-id }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get5
  "Apresenta os dados de um determinado cartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [device-id id ]
  (:data (consultar-using-get5-with-http-info device-id id)))

(defn listar-codigos-resposta-using-get-with-http-info
  "Lista os cÃ³digos de resposta dos recursos de transaÃ§Ã£o e consulta de conta
  Este mÃ©todo retorna a lista dos cÃ³digos de resposta das transaÃ§Ãµes e consulta de saque realizada no Pay."
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
  "Lista os cÃ³digos de resposta dos recursos de transaÃ§Ã£o e consulta de conta
  Este mÃ©todo retorna a lista dos cÃ³digos de resposta das transaÃ§Ãµes e consulta de saque realizada no Pay."
  []
  (:data (listar-codigos-resposta-using-get-with-http-info)))

(defn listar-modos-entrada-using-get-with-http-info
  "Lista os modos entradas
  Este recurso permite listar os modos de entrada para transaÃ§Ã£o"
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
  Este recurso permite listar os modos de entrada para transaÃ§Ã£o"
  []
  (:data (listar-modos-entrada-using-get-with-http-info)))

(defn listar-operacoes-using-get-with-http-info
  "Lista as operaÃ§Ãµes
  Este recurso permite listar as operaÃ§Ãµes disponiveis de transaÃ§Ã£o"
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
  "Lista as operaÃ§Ãµes
  Este recurso permite listar as operaÃ§Ãµes disponiveis de transaÃ§Ã£o"
  []
  (:data (listar-operacoes-using-get-with-http-info)))

(defn listar-tipos-terminais-using-get-with-http-info
  "Lista os tipos de terminais
  Este mÃ©todo retorna a lista dos tipos de terminais."
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
  Este mÃ©todo retorna a lista dos tipos de terminais."
  []
  (:data (listar-tipos-terminais-using-get-with-http-info)))

(defn listar-tipos-transacoes-using-get-with-http-info
  "Lista os tipos de transaÃ§Ãµes
  Este mÃ©todo retorna a lista dos tipos de transaÃ§Ãµes realizadas no Pay."
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
  "Lista os tipos de transaÃ§Ãµes
  Este mÃ©todo retorna a lista dos tipos de transaÃ§Ãµes realizadas no Pay."
  []
  (:data (listar-tipos-transacoes-using-get-with-http-info)))

(defn listar-using-get6-with-http-info
  "Lista os cartÃµes cadastrados
  Este mÃ©todo permite listar os cartÃµes cadastrado em um dispositivo."
  ([] (listar-using-get6-with-http-info nil))
  ([{:keys [device-id sort page limit status numero-cartao ]}]
   (call-api "/api/cartoes-tokenizados" :get
             {:path-params   {}
              :header-params {"device_id" device-id }
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "status" status "numeroCartao" numero-cartao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get6
  "Lista os cartÃµes cadastrados
  Este mÃ©todo permite listar os cartÃµes cadastrado em um dispositivo."
  ([] (listar-using-get6 nil))
  ([optional-params]
   (:data (listar-using-get6-with-http-info optional-params))))

(defn salvar-using-post4-with-http-info
  "CriaÃ§Ã£o de cartÃ£o
  Este metÃ³do permite a tokenizaÃ§Ã£o de um cartÃ£o a partir dos seus dados impressos."
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

(defn salvar-using-post4
  "CriaÃ§Ã£o de cartÃ£o
  Este metÃ³do permite a tokenizaÃ§Ã£o de um cartÃ£o a partir dos seus dados impressos."
  [device-id persist ]
  (:data (salvar-using-post4-with-http-info device-id persist)))
