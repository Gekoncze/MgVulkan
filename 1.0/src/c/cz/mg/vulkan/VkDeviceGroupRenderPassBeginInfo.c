#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupRenderPassBeginInfo);
}

void Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDeviceGroupRenderPassBeginInfo));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_getDeviceMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceMask);
}

void Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_setDeviceMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceMask, valuePointer, sizeof(o->deviceMask));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_getDeviceRenderAreaCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceRenderAreaCount);
}

void Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_setDeviceRenderAreaCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceRenderAreaCount, valuePointer, sizeof(o->deviceRenderAreaCount));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_getPDeviceRenderAreasNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pDeviceRenderAreas);
}

void Java_cz_mg_vulkan_VkDeviceGroupRenderPassBeginInfo_setPDeviceRenderAreasNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDeviceRenderAreas, &valuePointer, sizeof(o->pDeviceRenderAreas));
}


