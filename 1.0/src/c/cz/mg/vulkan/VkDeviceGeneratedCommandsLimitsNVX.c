#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGeneratedCommandsLimitsNVX);
}

jlong Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_getMaxIndirectCommandsLayoutTokenCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxIndirectCommandsLayoutTokenCount);
}

void Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_setMaxIndirectCommandsLayoutTokenCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxIndirectCommandsLayoutTokenCount, valuePointer, sizeof(o->maxIndirectCommandsLayoutTokenCount));
}

jlong Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_getMaxObjectEntryCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxObjectEntryCounts);
}

void Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_setMaxObjectEntryCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxObjectEntryCounts, valuePointer, sizeof(o->maxObjectEntryCounts));
}

jlong Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_getMinSequenceCountBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->minSequenceCountBufferOffsetAlignment);
}

void Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_setMinSequenceCountBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minSequenceCountBufferOffsetAlignment, valuePointer, sizeof(o->minSequenceCountBufferOffsetAlignment));
}

jlong Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_getMinSequenceIndexBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->minSequenceIndexBufferOffsetAlignment);
}

void Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_setMinSequenceIndexBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minSequenceIndexBufferOffsetAlignment, valuePointer, sizeof(o->minSequenceIndexBufferOffsetAlignment));
}

jlong Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_getMinCommandsTokenBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->minCommandsTokenBufferOffsetAlignment);
}

void Java_cz_mg_vulkan_VkDeviceGeneratedCommandsLimitsNVX_setMinCommandsTokenBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGeneratedCommandsLimitsNVX* o = (VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minCommandsTokenBufferOffsetAlignment, valuePointer, sizeof(o->minCommandsTokenBufferOffsetAlignment));
}


