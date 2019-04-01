#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetMemoryFdPropertiesKHR_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong handleType, jlong fd, jlong pMemoryFdProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetMemoryFdPropertiesKHR f = (PFN_vkGetMemoryFdPropertiesKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkExternalMemoryHandleTypeFlagBits*)jniLongToPointer(handleType)),
        *((int*)jniLongToPointer(fd)),
        ((VkMemoryFdPropertiesKHR*)jniLongToPointer(pMemoryFdProperties))
    );
}
