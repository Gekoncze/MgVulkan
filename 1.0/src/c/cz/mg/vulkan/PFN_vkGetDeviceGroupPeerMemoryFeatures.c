#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetDeviceGroupPeerMemoryFeatures_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jint heapIndex, jint localDeviceIndex, jint remoteDeviceIndex, jlong pPeerMemoryFeatures){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceGroupPeerMemoryFeatures f = (PFN_vkGetDeviceGroupPeerMemoryFeatures)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        (uint32_t)heapIndex,
        (uint32_t)localDeviceIndex,
        (uint32_t)remoteDeviceIndex,
        ((VkPeerMemoryFeatureFlags*)jniLongToPointer(pPeerMemoryFeatures))
    );
}

