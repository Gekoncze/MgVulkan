#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetShaderInfoAMD_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pipeline, jlong shaderStage, jlong infoType, jlong pInfoSize, jlong pInfo, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetShaderInfoAMD f = (PFN_vkGetShaderInfoAMD)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkPipeline*)jniLongToPointer(pipeline)),
        *((VkShaderStageFlagBits*)jniLongToPointer(shaderStage)),
        *((VkShaderInfoTypeAMD*)jniLongToPointer(infoType)),
        ((size_t*)jniLongToPointer(pInfoSize)),
        ((void*)jniLongToPointer(pInfo))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetShaderInfoAMD_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pipeline, jint shaderStage, jint infoType, jlong pInfoSize, jlong pInfo){
    (void)env;
    (void)jc;
    PFN_vkGetShaderInfoAMD f = (PFN_vkGetShaderInfoAMD)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkPipeline*)jniLongToPointer(pipeline)),
        (VkShaderStageFlagBits)shaderStage,
        (VkShaderInfoTypeAMD)infoType,
        ((size_t*)jniLongToPointer(pInfoSize)),
        ((void*)jniLongToPointer(pInfo))
    );
}

