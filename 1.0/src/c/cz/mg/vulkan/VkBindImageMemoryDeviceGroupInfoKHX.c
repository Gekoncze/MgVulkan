#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBindImageMemoryDeviceGroupInfoKHX);
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_getDeviceIndexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceIndexCount);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_setDeviceIndexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceIndexCount, valuePointer, sizeof(o->deviceIndexCount));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_getPDeviceIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pDeviceIndices);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_setPDeviceIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDeviceIndices, &valuePointer, sizeof(o->pDeviceIndices));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_getSFRRectCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->SFRRectCount);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_setSFRRectCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->SFRRectCount, valuePointer, sizeof(o->SFRRectCount));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_getPSFRRects(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pSFRRects);
}

void Java_cz_mg_vulkan_VkBindImageMemoryDeviceGroupInfoKHX_setPSFRRects(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryDeviceGroupInfoKHX* o = (VkBindImageMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSFRRects, &valuePointer, sizeof(o->pSFRRects));
}


