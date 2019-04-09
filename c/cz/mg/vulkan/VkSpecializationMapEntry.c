#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSpecializationMapEntry_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSpecializationMapEntry);
}

jlong Java_cz_mg_vulkan_VkSpecializationMapEntry_getConstantID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    return jniPointerToLong(&o->constantID);
}

void Java_cz_mg_vulkan_VkSpecializationMapEntry_setConstantID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->constantID, valuePointer, sizeof(o->constantID));
}

jlong Java_cz_mg_vulkan_VkSpecializationMapEntry_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    return jniPointerToLong(&o->offset);
}

void Java_cz_mg_vulkan_VkSpecializationMapEntry_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->offset, valuePointer, sizeof(o->offset));
}

jlong Java_cz_mg_vulkan_VkSpecializationMapEntry_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    return jniPointerToLong(&o->size);
}

void Java_cz_mg_vulkan_VkSpecializationMapEntry_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationMapEntry* o = (VkSpecializationMapEntry*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->size, valuePointer, sizeof(o->size));
}


