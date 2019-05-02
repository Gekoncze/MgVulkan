#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSparseImageMemoryRequirements);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkSparseImageMemoryRequirements));
}

jlong Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_getFormatPropertiesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->formatProperties);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_setFormatPropertiesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->formatProperties, valuePointer, sizeof(o->formatProperties));
}

jlong Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_getImageMipTailFirstLodNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageMipTailFirstLod);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_setImageMipTailFirstLodNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageMipTailFirstLod, valuePointer, sizeof(o->imageMipTailFirstLod));
}

jlong Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_getImageMipTailSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageMipTailSize);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_setImageMipTailSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageMipTailSize, valuePointer, sizeof(o->imageMipTailSize));
}

jlong Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_getImageMipTailOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageMipTailOffset);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_setImageMipTailOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageMipTailOffset, valuePointer, sizeof(o->imageMipTailOffset));
}

jlong Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_getImageMipTailStrideNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageMipTailStride);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryRequirements_setImageMipTailStrideNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryRequirements* o = (VkSparseImageMemoryRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageMipTailStride, valuePointer, sizeof(o->imageMipTailStride));
}


