#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkDebugMarkerSetObjectNameEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pNameInfo){
    (void)env;
    (void)jc;
    PFN_vkDebugMarkerSetObjectNameEXT f = (PFN_vkDebugMarkerSetObjectNameEXT)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDebugMarkerObjectNameInfoEXT*)jniLongToPointer(pNameInfo))
    );
}

