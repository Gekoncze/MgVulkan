#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkTextureLODGatherFormatPropertiesAMD_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkTextureLODGatherFormatPropertiesAMD);
}

jlong Java_cz_mg_vulkan_VkTextureLODGatherFormatPropertiesAMD_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkTextureLODGatherFormatPropertiesAMD* o = (VkTextureLODGatherFormatPropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkTextureLODGatherFormatPropertiesAMD_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkTextureLODGatherFormatPropertiesAMD* o = (VkTextureLODGatherFormatPropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkTextureLODGatherFormatPropertiesAMD_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkTextureLODGatherFormatPropertiesAMD* o = (VkTextureLODGatherFormatPropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkTextureLODGatherFormatPropertiesAMD_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkTextureLODGatherFormatPropertiesAMD* o = (VkTextureLODGatherFormatPropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkTextureLODGatherFormatPropertiesAMD_getSupportsTextureGatherLODBiasAMD(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkTextureLODGatherFormatPropertiesAMD* o = (VkTextureLODGatherFormatPropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportsTextureGatherLODBiasAMD);
}

void Java_cz_mg_vulkan_VkTextureLODGatherFormatPropertiesAMD_setSupportsTextureGatherLODBiasAMD(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkTextureLODGatherFormatPropertiesAMD* o = (VkTextureLODGatherFormatPropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportsTextureGatherLODBiasAMD, valuePointer, sizeof(o->supportsTextureGatherLODBiasAMD));
}


