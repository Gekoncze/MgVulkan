#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkBindBufferMemoryDeviceGroupInfoKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBindBufferMemoryDeviceGroupInfoKHX);
}

jlong Java_cz_mg_vulkan_VkBindBufferMemoryDeviceGroupInfoKHX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindBufferMemoryDeviceGroupInfoKHX* o = (VkBindBufferMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkBindBufferMemoryDeviceGroupInfoKHX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindBufferMemoryDeviceGroupInfoKHX* o = (VkBindBufferMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkBindBufferMemoryDeviceGroupInfoKHX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindBufferMemoryDeviceGroupInfoKHX* o = (VkBindBufferMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkBindBufferMemoryDeviceGroupInfoKHX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindBufferMemoryDeviceGroupInfoKHX* o = (VkBindBufferMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkBindBufferMemoryDeviceGroupInfoKHX_getDeviceIndexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindBufferMemoryDeviceGroupInfoKHX* o = (VkBindBufferMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceIndexCount);
}

void Java_cz_mg_vulkan_VkBindBufferMemoryDeviceGroupInfoKHX_setDeviceIndexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindBufferMemoryDeviceGroupInfoKHX* o = (VkBindBufferMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceIndexCount, valuePointer, sizeof(o->deviceIndexCount));
}

jlong Java_cz_mg_vulkan_VkBindBufferMemoryDeviceGroupInfoKHX_getPDeviceIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindBufferMemoryDeviceGroupInfoKHX* o = (VkBindBufferMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pDeviceIndices);
}

void Java_cz_mg_vulkan_VkBindBufferMemoryDeviceGroupInfoKHX_setPDeviceIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindBufferMemoryDeviceGroupInfoKHX* o = (VkBindBufferMemoryDeviceGroupInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDeviceIndices, &valuePointer, sizeof(o->pDeviceIndices));
}


