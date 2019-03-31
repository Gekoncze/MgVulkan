#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryRequirements_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSparseImageMemoryRequirements);
}

jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryRequirements_getFormatProperties(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&(o->formatProperties));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryRequirements_setFormatProperties(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    memcpy(&o->formatProperties, jniLongToPointer(valueAddress), sizeof(o->formatProperties));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryRequirements_getImageMipTailFirstLod(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageMipTailFirstLod));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryRequirements_setImageMipTailFirstLod(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    memcpy(&o->imageMipTailFirstLod, jniLongToPointer(valueAddress), sizeof(o->imageMipTailFirstLod));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryRequirements_getImageMipTailSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageMipTailSize));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryRequirements_setImageMipTailSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    memcpy(&o->imageMipTailSize, jniLongToPointer(valueAddress), sizeof(o->imageMipTailSize));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryRequirements_getImageMipTailOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageMipTailOffset));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryRequirements_setImageMipTailOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    memcpy(&o->imageMipTailOffset, jniLongToPointer(valueAddress), sizeof(o->imageMipTailOffset));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryRequirements_getImageMipTailStride(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageMipTailStride));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryRequirements_setImageMipTailStride(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    memcpy(&o->imageMipTailStride, jniLongToPointer(valueAddress), sizeof(o->imageMipTailStride));
}

