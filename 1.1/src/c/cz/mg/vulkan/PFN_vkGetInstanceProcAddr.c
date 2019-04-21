#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetInstanceProcAddr_call(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pName, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetInstanceProcAddr f = (PFN_vkGetInstanceProcAddr)jniLongToFunctionPointer(address);
    PFN_vkVoidFunction* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((char*)jniLongToPointer(pName))
    );
}
