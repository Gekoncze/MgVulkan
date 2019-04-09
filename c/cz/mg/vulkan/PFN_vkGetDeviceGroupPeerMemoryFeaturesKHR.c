#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetDeviceGroupPeerMemoryFeaturesKHR_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong heapIndex, jlong localDeviceIndex, jlong remoteDeviceIndex, jlong pPeerMemoryFeatures){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR f = (PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((uint32_t*)jniLongToPointer(heapIndex)),
        *((uint32_t*)jniLongToPointer(localDeviceIndex)),
        *((uint32_t*)jniLongToPointer(remoteDeviceIndex)),
        ((VkPeerMemoryFeatureFlags*)jniLongToPointer(pPeerMemoryFeatures))
    );
}
