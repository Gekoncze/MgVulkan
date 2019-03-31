#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImageSparseMemoryRequirementsInfo2_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageSparseMemoryRequirementsInfo2);
}

jlong Java_cz_mg_vulkan_vk_VkImageSparseMemoryRequirementsInfo2_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkImageSparseMemoryRequirementsInfo2_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkImageSparseMemoryRequirementsInfo2_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkImageSparseMemoryRequirementsInfo2_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkImageSparseMemoryRequirementsInfo2_getImage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->image));
}

void Java_cz_mg_vulkan_vk_VkImageSparseMemoryRequirementsInfo2_setImage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    memcpy(&o->image, jniLongToPointer(valueAddress), sizeof(o->image));
}

