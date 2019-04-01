#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupRenderPassBeginInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupRenderPassBeginInfo);
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupRenderPassBeginInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupRenderPassBeginInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupRenderPassBeginInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupRenderPassBeginInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupRenderPassBeginInfo_getDeviceMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceMask);
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupRenderPassBeginInfo_setDeviceMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceMask, valuePointer, sizeof(o->deviceMask));
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupRenderPassBeginInfo_getDeviceRenderAreaCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceRenderAreaCount);
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupRenderPassBeginInfo_setDeviceRenderAreaCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceRenderAreaCount, valuePointer, sizeof(o->deviceRenderAreaCount));
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupRenderPassBeginInfo_getPDeviceRenderAreas(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pDeviceRenderAreas);
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupRenderPassBeginInfo_setPDeviceRenderAreas(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupRenderPassBeginInfo* o = (VkDeviceGroupRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDeviceRenderAreas, &valuePointer, sizeof(o->pDeviceRenderAreas));
}


