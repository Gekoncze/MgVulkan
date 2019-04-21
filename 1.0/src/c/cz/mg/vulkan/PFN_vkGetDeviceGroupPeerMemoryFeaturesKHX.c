#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetDeviceGroupPeerMemoryFeaturesKHX_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong heapIndex, jlong localDeviceIndex, jlong remoteDeviceIndex, jlong pPeerMemoryFeatures){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceGroupPeerMemoryFeaturesKHX f = (PFN_vkGetDeviceGroupPeerMemoryFeaturesKHX)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((uint32_t*)jniLongToPointer(heapIndex)),
        *((uint32_t*)jniLongToPointer(localDeviceIndex)),
        *((uint32_t*)jniLongToPointer(remoteDeviceIndex)),
        ((VkPeerMemoryFeatureFlagsKHX*)jniLongToPointer(pPeerMemoryFeatures))
    );
}
