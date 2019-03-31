#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBindImageMemoryDeviceGroupInfo);
}

jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_getDeviceIndexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->deviceIndexCount));
}

void Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_setDeviceIndexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    memcpy(&o->deviceIndexCount, jniLongToPointer(valueAddress), sizeof(o->deviceIndexCount));
}
jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_getPDeviceIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pDeviceIndices));
}

void Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_setPDeviceIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    memcpy(&o->pDeviceIndices, jniLongToPointer(valueAddress), sizeof(o->pDeviceIndices));
}
jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_getSplitInstanceBindRegionCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->splitInstanceBindRegionCount));
}

void Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_setSplitInstanceBindRegionCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    memcpy(&o->splitInstanceBindRegionCount, jniLongToPointer(valueAddress), sizeof(o->splitInstanceBindRegionCount));
}
jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_getPSplitInstanceBindRegions(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pSplitInstanceBindRegions));
}

void Java_cz_mg_vulkan_vk_VkBindImageMemoryDeviceGroupInfo_setPSplitInstanceBindRegions(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfo* o = (VkBindImageMemoryDeviceGroupInfo*)jniLongToPointer(address);
    memcpy(&o->pSplitInstanceBindRegions, jniLongToPointer(valueAddress), sizeof(o->pSplitInstanceBindRegions));
}

