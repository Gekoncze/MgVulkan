#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkDebugReportMessageEXT_call(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong flags, jlong objectType, jlong object, jlong location, jlong messageCode, jlong pLayerPrefix, jlong pMessage){
    (void)env;
    (void)jc;
    PFN_vkDebugReportMessageEXT f = (PFN_vkDebugReportMessageEXT)jniLongToFunctionPointer(address);
    f(
        *((VkInstance*)jniLongToPointer(instance)),
        *((VkDebugReportFlagsEXT*)jniLongToPointer(flags)),
        *((VkDebugReportObjectTypeEXT*)jniLongToPointer(objectType)),
        *((uint64_t*)jniLongToPointer(object)),
        *((size_t*)jniLongToPointer(location)),
        *((int32_t*)jniLongToPointer(messageCode)),
        ((char*)jniLongToPointer(pLayerPrefix)),
        ((char*)jniLongToPointer(pMessage))
    );
}
