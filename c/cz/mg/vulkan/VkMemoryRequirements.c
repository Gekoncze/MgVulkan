#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkMemoryRequirements_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMemoryRequirements);
}

jlong Java_cz_mg_vulkan_vk_VkMemoryRequirements_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->size);
}

void Java_cz_mg_vulkan_vk_VkMemoryRequirements_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->size, valuePointer, sizeof(o->size));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryRequirements_getAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->alignment);
}

void Java_cz_mg_vulkan_vk_VkMemoryRequirements_setAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alignment, valuePointer, sizeof(o->alignment));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryRequirements_getMemoryTypeBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->memoryTypeBits);
}

void Java_cz_mg_vulkan_vk_VkMemoryRequirements_setMemoryTypeBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements* o = (VkMemoryRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memoryTypeBits, valuePointer, sizeof(o->memoryTypeBits));
}


