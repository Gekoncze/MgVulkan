#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetMemoryHostPointerPropertiesEXT_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong handleType, jlong pHostPointer, jlong pMemoryHostPointerProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetMemoryHostPointerPropertiesEXT f = (PFN_vkGetMemoryHostPointerPropertiesEXT)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkExternalMemoryHandleTypeFlagBits*)jniLongToPointer(handleType)),
        ((void*)jniLongToPointer(pHostPointer)),
        ((VkMemoryHostPointerPropertiesEXT*)jniLongToPointer(pMemoryHostPointerProperties))
    );
}
