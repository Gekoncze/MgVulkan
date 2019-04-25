#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkMemoryRequirements_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMemoryRequirements);
}

jlong Java_cz_mg_vulkan_VkMemoryRequirements_getSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->size);
}

void Java_cz_mg_vulkan_VkMemoryRequirements_setSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->size, valuePointer, sizeof(o->size));
}

jlong Java_cz_mg_vulkan_VkMemoryRequirements_getAlignmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->alignment);
}

void Java_cz_mg_vulkan_VkMemoryRequirements_setAlignmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alignment, valuePointer, sizeof(o->alignment));
}

jlong Java_cz_mg_vulkan_VkMemoryRequirements_getMemoryTypeBitsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->memoryTypeBits);
}

void Java_cz_mg_vulkan_VkMemoryRequirements_setMemoryTypeBitsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memoryTypeBits, valuePointer, sizeof(o->memoryTypeBits));
}


