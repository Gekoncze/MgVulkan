#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPipelineCacheData_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pipelineCache, jlong pDataSize, jlong pData, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetPipelineCacheData f = (PFN_vkGetPipelineCacheData)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkPipelineCache*)jniLongToPointer(pipelineCache)),
        ((size_t*)jniLongToPointer(pDataSize)),
        ((void*)jniLongToPointer(pData))
    );
}
