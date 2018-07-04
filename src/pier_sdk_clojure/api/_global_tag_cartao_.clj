(ns pier-sdk-clojure.api.-global-tag-cartao-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-alterar-senha-using-put-with-http-info
  "{{{cartao_resource_alterar_alterar_senha}}}
  {{{cartao_resource_alterar_alterar_senha_notes}}}"
  ([id senha ] (alterar-alterar-senha-using-put-with-http-info id senha nil))
  ([id senha {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/alterar-senha" :put
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization "senha" senha }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-alterar-senha-using-put
  "{{{cartao_resource_alterar_alterar_senha}}}
  {{{cartao_resource_alterar_alterar_senha_notes}}}"
  ([id senha ] (alterar-alterar-senha-using-put id senha nil))
  ([id senha optional-params]
   (:data (alterar-alterar-senha-using-put-with-http-info id senha optional-params))))

(defn alterar-estagio-using-post-with-http-info
  "{{{cartao_resource_alterar_estagio}}}
  {{{cartao_resource_alterar_estagio_notes}}}"
  ([id update ] (alterar-estagio-using-post-with-http-info id update nil))
  ([id update {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/alterar-estagio" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :body-param    update
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-estagio-using-post
  "{{{cartao_resource_alterar_estagio}}}
  {{{cartao_resource_alterar_estagio_notes}}}"
  ([id update ] (alterar-estagio-using-post id update nil))
  ([id update optional-params]
   (:data (alterar-estagio-using-post-with-http-info id update optional-params))))

(defn alterar-status-impressao-using-put-with-http-info
  "{{{cartao_resource_alterar_status_impressao}}}
  {{{cartao_resource_alterar_status_impressao_notes}}}"
  ([id id-status-impressao ] (alterar-status-impressao-using-put-with-http-info id id-status-impressao nil))
  ([id id-status-impressao {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/alterar-status-impressao" :put
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {"id_status_impressao" id-status-impressao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-status-impressao-using-put
  "{{{cartao_resource_alterar_status_impressao}}}
  {{{cartao_resource_alterar_status_impressao_notes}}}"
  ([id id-status-impressao ] (alterar-status-impressao-using-put id id-status-impressao nil))
  ([id id-status-impressao optional-params]
   (:data (alterar-status-impressao-using-put-with-http-info id id-status-impressao optional-params))))

(defn atribuir-pessoa-using-put-with-http-info
  "{{{cartao_resource_atribuir_pessoa}}}
  {{{cartao_resource_atribuir_pessoa_notes}}}"
  ([id id-pessoa ] (atribuir-pessoa-using-put-with-http-info id id-pessoa nil))
  ([id id-pessoa {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/atribuir-titular" :put
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {"id_pessoa" id-pessoa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn atribuir-pessoa-using-put
  "{{{cartao_resource_atribuir_pessoa}}}
  {{{cartao_resource_atribuir_pessoa_notes}}}"
  ([id id-pessoa ] (atribuir-pessoa-using-put id id-pessoa nil))
  ([id id-pessoa optional-params]
   (:data (atribuir-pessoa-using-put-with-http-info id id-pessoa optional-params))))

(defn bloquear-using-post-with-http-info
  "{{{cartao_resource_bloquear}}}
  {{{cartao_resource_bloquear_notes}}}"
  ([id id-status observacao ] (bloquear-using-post-with-http-info id id-status observacao nil))
  ([id id-status observacao {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/bloquear" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {"id_status" id-status "observacao" observacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn bloquear-using-post
  "{{{cartao_resource_bloquear}}}
  {{{cartao_resource_bloquear_notes}}}"
  ([id id-status observacao ] (bloquear-using-post id id-status observacao nil))
  ([id id-status observacao optional-params]
   (:data (bloquear-using-post-with-http-info id id-status observacao optional-params))))

(defn cadastrar-alterar-senha-using-post-with-http-info
  "{{{cartao_resource_cadastrar_alterar_senha}}}
  {{{cartao_resource_cadastrar_alterar_senha_notes}}}"
  ([id senha ] (cadastrar-alterar-senha-using-post-with-http-info id senha nil))
  ([id senha {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/cadastrar-senha" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization "senha" senha }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn cadastrar-alterar-senha-using-post
  "{{{cartao_resource_cadastrar_alterar_senha}}}
  {{{cartao_resource_cadastrar_alterar_senha_notes}}}"
  ([id senha ] (cadastrar-alterar-senha-using-post id senha nil))
  ([id senha optional-params]
   (:data (cadastrar-alterar-senha-using-post-with-http-info id senha optional-params))))

(defn cancelar-using-post-with-http-info
  "{{{cartao_resource_cancelar}}}
  {{{cartao_resource_cancelar_notes}}}"
  ([id id-status observacao ] (cancelar-using-post-with-http-info id id-status observacao nil))
  ([id id-status observacao {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/cancelar" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {"id_status" id-status "observacao" observacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn cancelar-using-post
  "{{{cartao_resource_cancelar}}}
  {{{cartao_resource_cancelar_notes}}}"
  ([id id-status observacao ] (cancelar-using-post id id-status observacao nil))
  ([id id-status observacao optional-params]
   (:data (cancelar-using-post-with-http-info id id-status observacao optional-params))))

(defn consultar-cartao-impressao-using-get-with-http-info
  "{{{cartao_resource_consultar_cartao_impressao}}}
  {{{cartao_resource_consultar_cartao_impressao_notes}}}"
  ([id ] (consultar-cartao-impressao-using-get-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/consultar-dados-impressao" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-cartao-impressao-using-get
  "{{{cartao_resource_consultar_cartao_impressao}}}
  {{{cartao_resource_consultar_cartao_impressao_notes}}}"
  ([id ] (consultar-cartao-impressao-using-get id nil))
  ([id optional-params]
   (:data (consultar-cartao-impressao-using-get-with-http-info id optional-params))))

(defn consultar-dados-reais-cartao-using-get-with-http-info
  "{{{cartao_resource_consultar_dados_reais_cartao}}}
  {{{cartao_resource_consultar_dados_reais_cartao_notes}}}"
  ([id ] (consultar-dados-reais-cartao-using-get-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/consultar-dados-reais" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-dados-reais-cartao-using-get
  "{{{cartao_resource_consultar_dados_reais_cartao}}}
  {{{cartao_resource_consultar_dados_reais_cartao_notes}}}"
  ([id ] (consultar-dados-reais-cartao-using-get id nil))
  ([id optional-params]
   (:data (consultar-dados-reais-cartao-using-get-with-http-info id optional-params))))

(defn consultar-limite-disponibilidade-using-get-with-http-info
  "{{{cartao_resource_consultar_limite_disponibilidade}}}
  {{{cartao_resource_consultar_limite_disponibilidade_notes}}}"
  ([id ] (consultar-limite-disponibilidade-using-get-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/limites-disponibilidades" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-limite-disponibilidade-using-get
  "{{{cartao_resource_consultar_limite_disponibilidade}}}
  {{{cartao_resource_consultar_limite_disponibilidade_notes}}}"
  ([id ] (consultar-limite-disponibilidade-using-get id nil))
  ([id optional-params]
   (:data (consultar-limite-disponibilidade-using-get-with-http-info id optional-params))))

(defn consultar-lotes-cartoes-pre-pagos-using-get-with-http-info
  "{{{cartao_resource_consultar_lotes_cartoes_pre_pagos}}}
  {{{cartao_resource_consultar_lotes_cartoes_pre_pagos_notes}}}"
  ([id ] (consultar-lotes-cartoes-pre-pagos-using-get-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/lotes-cartoes-pre-pagos/{id}" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-lotes-cartoes-pre-pagos-using-get
  "{{{cartao_resource_consultar_lotes_cartoes_pre_pagos}}}
  {{{cartao_resource_consultar_lotes_cartoes_pre_pagos_notes}}}"
  ([id ] (consultar-lotes-cartoes-pre-pagos-using-get id nil))
  ([id optional-params]
   (:data (consultar-lotes-cartoes-pre-pagos-using-get-with-http-info id optional-params))))

(defn consultar-portador-using-get-with-http-info
  "{{{cartao_resource_consultar_portador}}}
  {{{cartao_resource_consultar_portador_notes}}}"
  ([id ] (consultar-portador-using-get-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/portadores" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-portador-using-get
  "{{{cartao_resource_consultar_portador}}}
  {{{cartao_resource_consultar_portador_notes}}}"
  ([id ] (consultar-portador-using-get id nil))
  ([id optional-params]
   (:data (consultar-portador-using-get-with-http-info id optional-params))))

(defn consultar-using-get9-with-http-info
  "{{{cartao_resource_consultar}}}
  {{{cartao_resource_consultar_notes}}}"
  ([id ] (consultar-using-get9-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get9
  "{{{cartao_resource_consultar}}}
  {{{cartao_resource_consultar_notes}}}"
  ([id ] (consultar-using-get9 id nil))
  ([id optional-params]
   (:data (consultar-using-get9-with-http-info id optional-params))))

(defn desbloquear-senha-incorreta-using-post-with-http-info
  "{{{cartao_resource_desbloquear_senha_incorreta}}}
  {{{cartao_resource_desbloquear_senha_incorreta_notes}}}"
  ([id ] (desbloquear-senha-incorreta-using-post-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/desbloquear-senha-incorreta" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn desbloquear-senha-incorreta-using-post
  "{{{cartao_resource_desbloquear_senha_incorreta}}}
  {{{cartao_resource_desbloquear_senha_incorreta_notes}}}"
  ([id ] (desbloquear-senha-incorreta-using-post id nil))
  ([id optional-params]
   (:data (desbloquear-senha-incorreta-using-post-with-http-info id optional-params))))

(defn desbloquear-using-post-with-http-info
  "{{{cartao_resource_desbloquear}}}
  {{{cartao_resource_desbloquear_notes}}}"
  ([id ] (desbloquear-using-post-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/desbloquear" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn desbloquear-using-post
  "{{{cartao_resource_desbloquear}}}
  {{{cartao_resource_desbloquear_notes}}}"
  ([id ] (desbloquear-using-post id nil))
  ([id optional-params]
   (:data (desbloquear-using-post-with-http-info id optional-params))))

(defn gerar-lotes-cartoes-pre-pagos-using-post-with-http-info
  "{{{cartao_resource_gerar_lotes_cartoes_pre_pagos}}}
  {{{cartao_resource_gerar_lotes_cartoes_pre_pagos_notes}}}"
  ([] (gerar-lotes-cartoes-pre-pagos-using-post-with-http-info nil))
  ([{:keys [authorization id-origem-comercial id-produto id-tipo-cartao id-imagem id-endereco quantidade-cartoes identificador-externo ]}]
   (call-api "/api/cartoes/lotes-cartoes-pre-pagos" :post
             {:path-params   {}
              :header-params {"Authorization" authorization }
              :query-params  {"idOrigemComercial" id-origem-comercial "idProduto" id-produto "idTipoCartao" id-tipo-cartao "idImagem" id-imagem "idEndereco" id-endereco "quantidadeCartoes" quantidade-cartoes "identificadorExterno" identificador-externo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn gerar-lotes-cartoes-pre-pagos-using-post
  "{{{cartao_resource_gerar_lotes_cartoes_pre_pagos}}}
  {{{cartao_resource_gerar_lotes_cartoes_pre_pagos_notes}}}"
  ([] (gerar-lotes-cartoes-pre-pagos-using-post nil))
  ([optional-params]
   (:data (gerar-lotes-cartoes-pre-pagos-using-post-with-http-info optional-params))))

(defn gerar-nova-via-cartao-multi-app-using-post-with-http-info
  "{{{cartao_resource_gerar_nova_via_multiplo}}}
  {{{cartao_resource_gerar_nova_via_multiplo_notes}}}"
  ([id ] (gerar-nova-via-cartao-multi-app-using-post-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/gerar-nova-via-multiplo" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn gerar-nova-via-cartao-multi-app-using-post
  "{{{cartao_resource_gerar_nova_via_multiplo}}}
  {{{cartao_resource_gerar_nova_via_multiplo_notes}}}"
  ([id ] (gerar-nova-via-cartao-multi-app-using-post id nil))
  ([id optional-params]
   (:data (gerar-nova-via-cartao-multi-app-using-post-with-http-info id optional-params))))

(defn gerar-nova-via-using-post-with-http-info
  "{{{cartao_resource_gerar_nova_via}}}
  {{{cartao_resource_gerar_nova_via_notes}}}"
  ([id ] (gerar-nova-via-using-post-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/gerar-nova-via" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn gerar-nova-via-using-post
  "{{{cartao_resource_gerar_nova_via}}}
  {{{cartao_resource_gerar_nova_via_notes}}}"
  ([id ] (gerar-nova-via-using-post id nil))
  ([id optional-params]
   (:data (gerar-nova-via-using-post-with-http-info id optional-params))))

(defn lancar-tarifa-segunda-via-using-post-with-http-info
  "{{{cartao_resource_lancar_tarifa_segunda_via}}}
  {{{cartao_resource_lancar_tarifa_segunda_via_notes}}}"
  ([id ] (lancar-tarifa-segunda-via-using-post-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/lancar-tarifa-reemissao" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn lancar-tarifa-segunda-via-using-post
  "{{{cartao_resource_lancar_tarifa_segunda_via}}}
  {{{cartao_resource_lancar_tarifa_segunda_via_notes}}}"
  ([id ] (lancar-tarifa-segunda-via-using-post id nil))
  ([id optional-params]
   (:data (lancar-tarifa-segunda-via-using-post-with-http-info id optional-params))))

(defn listar-lotes-cartoes-pre-pagos-using-get-with-http-info
  "{{{cartao_resource_listar_lotes_cartoes_pre_pagos}}}
  {{{cartao_resource_listar_lotes_cartoes_pre_pagos_notes}}}"
  ([] (listar-lotes-cartoes-pre-pagos-using-get-with-http-info nil))
  ([{:keys [authorization sort page limit id-origem-comercial id-produto id-tipo-cartao id-imagem id-endereco quantidade-cartoes data-cadastro usuario-cadastro status-processamento identificador-externo ]}]
   (call-api "/api/cartoes/lotes-cartoes-pre-pagos" :get
             {:path-params   {}
              :header-params {"Authorization" authorization }
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idOrigemComercial" id-origem-comercial "idProduto" id-produto "idTipoCartao" id-tipo-cartao "idImagem" id-imagem "idEndereco" id-endereco "quantidadeCartoes" quantidade-cartoes "dataCadastro" data-cadastro "usuarioCadastro" usuario-cadastro "statusProcessamento" status-processamento "identificadorExterno" identificador-externo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-lotes-cartoes-pre-pagos-using-get
  "{{{cartao_resource_listar_lotes_cartoes_pre_pagos}}}
  {{{cartao_resource_listar_lotes_cartoes_pre_pagos_notes}}}"
  ([] (listar-lotes-cartoes-pre-pagos-using-get nil))
  ([optional-params]
   (:data (listar-lotes-cartoes-pre-pagos-using-get-with-http-info optional-params))))

(defn listar-using-get11-with-http-info
  "{{{cartao_resource_listar}}}
  {{{cartao_resource_listar_notes}}}"
  ([] (listar-using-get11-with-http-info nil))
  ([{:keys [authorization sort page limit id-status-cartao id-estagio-cartao id-conta id-pessoa id-produto tipo-portador numero-cartao nome-impresso data-geracao data-status-cartao data-estagio-cartao data-validade data-impressao arquivo-impressao flag-impressao-origem-comercial flag-provisorio codigo-desbloqueio sequencial-cartao ]}]
   (call-api "/api/cartoes" :get
             {:path-params   {}
              :header-params {"Authorization" authorization }
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idStatusCartao" id-status-cartao "idEstagioCartao" id-estagio-cartao "idConta" id-conta "idPessoa" id-pessoa "idProduto" id-produto "tipoPortador" tipo-portador "numeroCartao" numero-cartao "nomeImpresso" nome-impresso "dataGeracao" data-geracao "dataStatusCartao" data-status-cartao "dataEstagioCartao" data-estagio-cartao "dataValidade" data-validade "dataImpressao" data-impressao "arquivoImpressao" arquivo-impressao "flagImpressaoOrigemComercial" flag-impressao-origem-comercial "flagProvisorio" flag-provisorio "codigoDesbloqueio" codigo-desbloqueio "sequencialCartao" sequencial-cartao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get11
  "{{{cartao_resource_listar}}}
  {{{cartao_resource_listar_notes}}}"
  ([] (listar-using-get11 nil))
  ([optional-params]
   (:data (listar-using-get11-with-http-info optional-params))))

(defn reativar-using-post-with-http-info
  "{{{cartao_resource_reativar}}}
  {{{cartao_resource_reativar_notes}}}"
  ([id ] (reativar-using-post-with-http-info id nil))
  ([id {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/reativar" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn reativar-using-post
  "{{{cartao_resource_reativar}}}
  {{{cartao_resource_reativar_notes}}}"
  ([id ] (reativar-using-post id nil))
  ([id optional-params]
   (:data (reativar-using-post-with-http-info id optional-params))))

(defn validar-cvv-using-post-with-http-info
  "{{{cartao_resource_validar_c_v_v}}}
  {{{cartao_resource_validar_c_v_v_notes}}}"
  ([id valida-cvv ] (validar-cvv-using-post-with-http-info id valida-cvv nil))
  ([id valida-cvv {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/validar-cvv" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization }
              :query-params  {}
              :form-params   {}
              :body-param    valida-cvv
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn validar-cvv-using-post
  "{{{cartao_resource_validar_c_v_v}}}
  {{{cartao_resource_validar_c_v_v_notes}}}"
  ([id valida-cvv ] (validar-cvv-using-post id valida-cvv nil))
  ([id valida-cvv optional-params]
   (:data (validar-cvv-using-post-with-http-info id valida-cvv optional-params))))

(defn validar-dados-impressos-bandeirado-using-get-with-http-info
  "{{{cartao_resource_validar_dados_impressos_bandeirado}}}
  {{{cartao_resource_validar_dados_impressos_bandeirado_notes}}}"
  ([numero-cartao nome-portador data-validade codigo-seguranca ] (validar-dados-impressos-bandeirado-using-get-with-http-info numero-cartao nome-portador data-validade codigo-seguranca nil))
  ([numero-cartao nome-portador data-validade codigo-seguranca {:keys [authorization ]}]
   (call-api "/api/cartoes/validar-dados-impressos-bandeirados" :get
             {:path-params   {}
              :header-params {"Authorization" authorization }
              :query-params  {"numero_cartao" numero-cartao "nome_portador" nome-portador "data_validade" data-validade "codigo_seguranca" codigo-seguranca }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn validar-dados-impressos-bandeirado-using-get
  "{{{cartao_resource_validar_dados_impressos_bandeirado}}}
  {{{cartao_resource_validar_dados_impressos_bandeirado_notes}}}"
  ([numero-cartao nome-portador data-validade codigo-seguranca ] (validar-dados-impressos-bandeirado-using-get numero-cartao nome-portador data-validade codigo-seguranca nil))
  ([numero-cartao nome-portador data-validade codigo-seguranca optional-params]
   (:data (validar-dados-impressos-bandeirado-using-get-with-http-info numero-cartao nome-portador data-validade codigo-seguranca optional-params))))

(defn validar-dados-impressos-nao-bandeirado-using-get-with-http-info
  "{{{cartao_resource_validar_dados_impressos_nao_bandeirado}}}
  {{{cartao_resource_validar_dados_impressos_nao_bandeirado_notes}}}"
  ([numero-cartao nome-portador data-validade codigo-seguranca ] (validar-dados-impressos-nao-bandeirado-using-get-with-http-info numero-cartao nome-portador data-validade codigo-seguranca nil))
  ([numero-cartao nome-portador data-validade codigo-seguranca {:keys [authorization ]}]
   (call-api "/api/cartoes/validar-dados-impressos-nao-bandeirados" :get
             {:path-params   {}
              :header-params {"Authorization" authorization }
              :query-params  {"numero_cartao" numero-cartao "nome_portador" nome-portador "data_validade" data-validade "codigo_seguranca" codigo-seguranca }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn validar-dados-impressos-nao-bandeirado-using-get
  "{{{cartao_resource_validar_dados_impressos_nao_bandeirado}}}
  {{{cartao_resource_validar_dados_impressos_nao_bandeirado_notes}}}"
  ([numero-cartao nome-portador data-validade codigo-seguranca ] (validar-dados-impressos-nao-bandeirado-using-get numero-cartao nome-portador data-validade codigo-seguranca nil))
  ([numero-cartao nome-portador data-validade codigo-seguranca optional-params]
   (:data (validar-dados-impressos-nao-bandeirado-using-get-with-http-info numero-cartao nome-portador data-validade codigo-seguranca optional-params))))

(defn validar-de55-cartao-mastercard-using-get-with-http-info
  "{{{cartao_resource_validar_de55_cartao_mastercard}}}
  {{{cartao_resource_validar_de55_cartao_mastercard_notes}}}"
  ([numero-cartao criptograma ] (validar-de55-cartao-mastercard-using-get-with-http-info numero-cartao criptograma nil))
  ([numero-cartao criptograma {:keys [authorization ]}]
   (call-api "/api/cartoes/validar-de55-mastercard" :get
             {:path-params   {}
              :header-params {"Authorization" authorization }
              :query-params  {"numero_cartao" numero-cartao "criptograma" criptograma }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn validar-de55-cartao-mastercard-using-get
  "{{{cartao_resource_validar_de55_cartao_mastercard}}}
  {{{cartao_resource_validar_de55_cartao_mastercard_notes}}}"
  ([numero-cartao criptograma ] (validar-de55-cartao-mastercard-using-get numero-cartao criptograma nil))
  ([numero-cartao criptograma optional-params]
   (:data (validar-de55-cartao-mastercard-using-get-with-http-info numero-cartao criptograma optional-params))))

(defn validar-senha-using-get-with-http-info
  "{{{cartao_resource_validar_senha}}}
  {{{cartao_resource_validar_senha_notes}}}"
  ([id senha ] (validar-senha-using-get-with-http-info id senha nil))
  ([id senha {:keys [authorization ]}]
   (call-api "/api/cartoes/{id}/validar-senha" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" authorization "senha" senha }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn validar-senha-using-get
  "{{{cartao_resource_validar_senha}}}
  {{{cartao_resource_validar_senha_notes}}}"
  ([id senha ] (validar-senha-using-get id senha nil))
  ([id senha optional-params]
   (:data (validar-senha-using-get-with-http-info id senha optional-params))))

(defn validar-tarja-using-get-with-http-info
  "{{{cartao_resource_validar_tarja}}}
  {{{cartao_resource_validar_tarja_notes}}}"
  ([numero-cartao trilha1 trilha2 ] (validar-tarja-using-get-with-http-info numero-cartao trilha1 trilha2 nil))
  ([numero-cartao trilha1 trilha2 {:keys [authorization ]}]
   (call-api "/api/cartoes/validar-tarja" :get
             {:path-params   {}
              :header-params {"Authorization" authorization }
              :query-params  {"numero_cartao" numero-cartao "trilha1" trilha1 "trilha2" trilha2 }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn validar-tarja-using-get
  "{{{cartao_resource_validar_tarja}}}
  {{{cartao_resource_validar_tarja_notes}}}"
  ([numero-cartao trilha1 trilha2 ] (validar-tarja-using-get numero-cartao trilha1 trilha2 nil))
  ([numero-cartao trilha1 trilha2 optional-params]
   (:data (validar-tarja-using-get-with-http-info numero-cartao trilha1 trilha2 optional-params))))
