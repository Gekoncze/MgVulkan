#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBindImageMemoryDeviceGroupInfo);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkBindImageMemoryDeviceGroupInfo));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_getDeviceIndexCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceIndexCount);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_setDeviceIndexCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceIndexCount, valuePointer, sizeof(o->deviceIndexCount));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_getPDeviceIndicesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pDeviceIndices);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_setPDeviceIndicesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDeviceIndices, &valuePointer, sizeof(o->pDeviceIndices));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_getSplitInstanceBindRegionCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->splitInstanceBindRegionCount);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_setSplitInstanceBindRegionCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->splitInstanceBindRegionCount, valuePointer, sizeof(o->splitInstanceBindRegionCount));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_getPSplitInstanceBindRegionsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSplitInstanceBindRegions);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfo_setPSplitInstanceBindRegionsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSplitInstanceBindRegions, &valuePointer, sizeof(o->pSplitInstanceBindRegions));
}


