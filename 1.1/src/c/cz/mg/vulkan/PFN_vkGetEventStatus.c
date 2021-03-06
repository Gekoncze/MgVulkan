#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkGetEventStatus_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong event){
    (void)env;
    (void)jc;
    PFN_vkGetEventStatus f = (PFN_vkGetEventStatus)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkEvent*)jniLongToPointer(event))
    );
}

