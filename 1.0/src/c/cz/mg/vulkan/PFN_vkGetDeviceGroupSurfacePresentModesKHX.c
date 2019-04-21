#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetDeviceGroupSurfacePresentModesKHX_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong surface, jlong pModes, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceGroupSurfacePresentModesKHX f = (PFN_vkGetDeviceGroupSurfacePresentModesKHX)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSurfaceKHR*)jniLongToPointer(surface)),
        ((VkDeviceGroupPresentModeFlagsKHX*)jniLongToPointer(pModes))
    );
}
