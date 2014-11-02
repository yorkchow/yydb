package com.yydb.common.web.jcaptcha;

import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/3
 * Time: 1:37
 */
public class EsManageableImageCaptchaService extends DefaultManageableImageCaptchaService {

    public EsManageableImageCaptchaService(com.octo.captcha.service.captchastore.CaptchaStore captchaStore, com.octo.captcha.engine.CaptchaEngine captchaEngine, int minGuarantedStorageDelayInSeconds, int maxCaptchaStoreSize, int captchaStoreLoadBeforeGarbageCollection) {
        super(captchaStore, captchaEngine, minGuarantedStorageDelayInSeconds, maxCaptchaStoreSize, captchaStoreLoadBeforeGarbageCollection);
    }

    public boolean hasCapcha(String id, String userCaptchaResponse) {
        return store.getCaptcha(id).validateResponse(userCaptchaResponse);
    }
}
