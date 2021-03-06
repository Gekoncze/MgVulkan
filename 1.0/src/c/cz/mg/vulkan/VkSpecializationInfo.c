#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSpecializationInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSpecializationInfo);
}

void Java_cz_mg_vulkan_VkSpecializationInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkSpecializationInfo));
}

jlong Java_cz_mg_vulkan_VkSpecializationInfo_getMapEntryCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->mapEntryCount);
}

void Java_cz_mg_vulkan_VkSpecializationInfo_setMapEntryCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mapEntryCount, valuePointer, sizeof(o->mapEntryCount));
}

jlong Java_cz_mg_vulkan_VkSpecializationInfo_getPMapEntriesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pMapEntries);
}

void Java_cz_mg_vulkan_VkSpecializationInfo_setPMapEntriesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pMapEntries, &valuePointer, sizeof(o->pMapEntries));
}

jlong Java_cz_mg_vulkan_VkSpecializationInfo_getDataSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->dataSize);
}

void Java_cz_mg_vulkan_VkSpecializationInfo_setDataSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dataSize, valuePointer, sizeof(o->dataSize));
}

jlong Java_cz_mg_vulkan_VkSpecializationInfo_getPDataNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pData);
}

void Java_cz_mg_vulkan_VkSpecializationInfo_setPDataNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSpecializationInfo* o = (VkSpecializationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pData, &valuePointer, sizeof(o->pData));
}


