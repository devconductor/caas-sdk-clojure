(ns pier-sdk-clojure.api.antecipacoes
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn configurar-taxa-antecipacao-using-post-with-http-info
  "Configura a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite configurar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id taxa-antecipacao-request ]
  (call-api "/api/produtos/{id}/configurar-taxa-antecipacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    taxa-antecipacao-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn configurar-taxa-antecipacao-using-post
  "Configura a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite configurar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id taxa-antecipacao-request ]
  (:data (configurar-taxa-antecipacao-using-post-with-http-info id taxa-antecipacao-request)))

(defn consultar-taxa-antecipacao-using-get-with-http-info
  "Consulta a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite consultar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id tipo-transacao ]
  (call-api "/api/produtos/{id}/consultar-taxa-antecipacao" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"tipoTransacao" tipo-transacao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-taxa-antecipacao-using-get
  "Consulta a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite consultar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id tipo-transacao ]
  (:data (consultar-taxa-antecipacao-using-get-with-http-info id tipo-transacao)))

(defn efetivar-antecipacao-using-post-with-http-info
  "Faz a efetivaÃ§Ã£o da antecipaÃ§Ã£o
  MÃ©todo responsavel pela efetivaÃ§Ã£o da antecipaÃ§Ã£o, cujo desconto Ã© calculado baseado na data da Ãºltima parcela em aberto."
  [id-conta id quantidade-parcelas ]
  (call-api "/api/compras-antecipaveis/{id}/efetivar-antecipacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"idConta" id-conta "quantidadeParcelas" quantidade-parcelas }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn efetivar-antecipacao-using-post
  "Faz a efetivaÃ§Ã£o da antecipaÃ§Ã£o
  MÃ©todo responsavel pela efetivaÃ§Ã£o da antecipaÃ§Ã£o, cujo desconto Ã© calculado baseado na data da Ãºltima parcela em aberto."
  [id-conta id quantidade-parcelas ]
  (:data (efetivar-antecipacao-using-post-with-http-info id-conta id quantidade-parcelas)))

(defn listar-using-get7-with-http-info
  "Listar compras com parcelas antecipÃ¡veis
  Lista as compras antecipÃ¡veis de uma conta."
  ([id-conta ] (listar-using-get7-with-http-info id-conta nil))
  ([id-conta {:keys [sort page limit id-compra parcelada juros tipo-origem-transacao ]}]
   (call-api "/api/compras-antecipaveis" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idCompra" id-compra "idConta" id-conta "parcelada" parcelada "juros" juros "tipoOrigemTransacao" tipo-origem-transacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get7
  "Listar compras com parcelas antecipÃ¡veis
  Lista as compras antecipÃ¡veis de uma conta."
  ([id-conta ] (listar-using-get7 id-conta nil))
  ([id-conta optional-params]
   (:data (listar-using-get7-with-http-info id-conta optional-params))))

(defn simular-antecipacao-using-get-with-http-info
  "Simular antecipaÃ§Ã£o de parcelas
  Simula a antecipaÃ§Ã£o de parcelas de um evento, listando todos os planos de parcelamento disponÃ­veis, cujo desconto Ã© calculado baseado na data da Ãºltima parcela em aberto."
  [id-conta id ]
  (call-api "/api/compras-antecipaveis/{id}/simular-antecipacao" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"idConta" id-conta }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn simular-antecipacao-using-get
  "Simular antecipaÃ§Ã£o de parcelas
  Simula a antecipaÃ§Ã£o de parcelas de um evento, listando todos os planos de parcelamento disponÃ­veis, cujo desconto Ã© calculado baseado na data da Ãºltima parcela em aberto."
  [id-conta id ]
  (:data (simular-antecipacao-using-get-with-http-info id-conta id)))
