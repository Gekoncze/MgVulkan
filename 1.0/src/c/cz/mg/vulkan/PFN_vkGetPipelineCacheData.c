#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkGetPipelineCacheData_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pipelineCache, jlong pDataSize, jlong pData){
    (void)env;
    (void)jc;
    PFN_vkGetPipelineCacheData f = (PFN_vkGetPipelineCacheData)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkPipelineCache*)jniLongToPointer(pipelineCache)),
        ((size_t*)jniLongToPointer(pDataSize)),
        ((void*)jniLongToPointer(pData))
    );
}

