#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSpecializationInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSpecializationInfo);
}

jlong Java_cz_mg_vulkan_vk_VkSpecializationInfo_getMapEntryCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->mapEntryCount);
}

void Java_cz_mg_vulkan_vk_VkSpecializationInfo_setMapEntryCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mapEntryCount, valuePointer, sizeof(o->mapEntryCount));
}

jlong Java_cz_mg_vulkan_vk_VkSpecializationInfo_getPMapEntries(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pMapEntries);
}

void Java_cz_mg_vulkan_vk_VkSpecializationInfo_setPMapEntries(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pMapEntries, &valuePointer, sizeof(o->pMapEntries));
}

jlong Java_cz_mg_vulkan_vk_VkSpecializationInfo_getDataSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->dataSize);
}

void Java_cz_mg_vulkan_vk_VkSpecializationInfo_setDataSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dataSize, valuePointer, sizeof(o->dataSize));
}

jlong Java_cz_mg_vulkan_vk_VkSpecializationInfo_getPData(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pData);
}

void Java_cz_mg_vulkan_vk_VkSpecializationInfo_setPData(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pData, &valuePointer, sizeof(o->pData));
}


