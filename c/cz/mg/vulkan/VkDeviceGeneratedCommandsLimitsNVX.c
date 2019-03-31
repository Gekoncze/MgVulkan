#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGeneratedCommandsLimitsNVX);
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_getMaxIndirectCommandsLayoutTokenCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxIndirectCommandsLayoutTokenCount));
}

void Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_setMaxIndirectCommandsLayoutTokenCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    memcpy(&o->maxIndirectCommandsLayoutTokenCount, jniLongToPointer(valueAddress), sizeof(o->maxIndirectCommandsLayoutTokenCount));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_getMaxObjectEntryCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxObjectEntryCounts));
}

void Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_setMaxObjectEntryCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    memcpy(&o->maxObjectEntryCounts, jniLongToPointer(valueAddress), sizeof(o->maxObjectEntryCounts));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_getMinSequenceCountBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minSequenceCountBufferOffsetAlignment));
}

void Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_setMinSequenceCountBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    memcpy(&o->minSequenceCountBufferOffsetAlignment, jniLongToPointer(valueAddress), sizeof(o->minSequenceCountBufferOffsetAlignment));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_getMinSequenceIndexBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minSequenceIndexBufferOffsetAlignment));
}

void Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_setMinSequenceIndexBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    memcpy(&o->minSequenceIndexBufferOffsetAlignment, jniLongToPointer(valueAddress), sizeof(o->minSequenceIndexBufferOffsetAlignment));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_getMinCommandsTokenBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minCommandsTokenBufferOffsetAlignment));
}

void Java_cz_mg_vulkan_vk_VkDeviceGeneratedCommandsLimitsNVX_setMinCommandsTokenBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    memcpy(&o->minCommandsTokenBufferOffsetAlignment, jniLongToPointer(valueAddress), sizeof(o->minCommandsTokenBufferOffsetAlignment));
}

