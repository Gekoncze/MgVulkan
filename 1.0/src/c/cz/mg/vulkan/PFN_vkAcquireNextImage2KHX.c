#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkAcquireNextImage2KHX_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pAcquireInfo, jlong pImageIndex, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkAcquireNextImage2KHX f = (PFN_vkAcquireNextImage2KHX)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkAcquireNextImageInfoKHX*)jniLongToPointer(pAcquireInfo)),
        ((uint32_t*)jniLongToPointer(pImageIndex))
    );
}
