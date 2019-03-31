#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetDeviceProcAddr_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pName, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceProcAddr f = (PFN_vkGetDeviceProcAddr)jniLongToFunctionPointer(address);
    PFN_vkVoidFunction* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((char*)jniLongToPointer(pName))
    );
}
