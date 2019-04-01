#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkDebugMarkerSetObjectTagEXT_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pTagInfo, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkDebugMarkerSetObjectTagEXT f = (PFN_vkDebugMarkerSetObjectTagEXT)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(pTagInfo))
    );
}
