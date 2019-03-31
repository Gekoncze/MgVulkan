#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSpecializationMapEntry_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSpecializationMapEntry);
}

jlong Java_cz_mg_vulkan_vk_VkSpecializationMapEntry_getConstantID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    return jniPointerToLong(&(o->constantID));
}

void Java_cz_mg_vulkan_vk_VkSpecializationMapEntry_setConstantID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    memcpy(&o->constantID, jniLongToPointer(valueAddress), sizeof(o->constantID));
}
jlong Java_cz_mg_vulkan_vk_VkSpecializationMapEntry_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    return jniPointerToLong(&(o->offset));
}

void Java_cz_mg_vulkan_vk_VkSpecializationMapEntry_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    memcpy(&o->offset, jniLongToPointer(valueAddress), sizeof(o->offset));
}
jlong Java_cz_mg_vulkan_vk_VkSpecializationMapEntry_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    return jniPointerToLong(&(o->size));
}

void Java_cz_mg_vulkan_vk_VkSpecializationMapEntry_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    memcpy(&o->size, jniLongToPointer(valueAddress), sizeof(o->size));
}

