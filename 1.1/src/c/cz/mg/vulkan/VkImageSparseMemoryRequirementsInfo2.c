#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageSparseMemoryRequirementsInfo2_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageSparseMemoryRequirementsInfo2);
}

jlong Java_cz_mg_vulkan_VkImageSparseMemoryRequirementsInfo2_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImageSparseMemoryRequirementsInfo2_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImageSparseMemoryRequirementsInfo2_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImageSparseMemoryRequirementsInfo2_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImageSparseMemoryRequirementsInfo2_getImage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&o->image);
}

void Java_cz_mg_vulkan_VkImageSparseMemoryRequirementsInfo2_setImage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSparseMemoryRequirementsInfo2* o = (VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->image, valuePointer, sizeof(o->image));
}


