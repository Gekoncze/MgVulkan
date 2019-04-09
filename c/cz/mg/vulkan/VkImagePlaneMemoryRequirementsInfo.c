#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImagePlaneMemoryRequirementsInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImagePlaneMemoryRequirementsInfo);
}

jlong Java_cz_mg_vulkan_VkImagePlaneMemoryRequirementsInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImagePlaneMemoryRequirementsInfo* o = (VkImagePlaneMemoryRequirementsInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImagePlaneMemoryRequirementsInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImagePlaneMemoryRequirementsInfo* o = (VkImagePlaneMemoryRequirementsInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImagePlaneMemoryRequirementsInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImagePlaneMemoryRequirementsInfo* o = (VkImagePlaneMemoryRequirementsInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImagePlaneMemoryRequirementsInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImagePlaneMemoryRequirementsInfo* o = (VkImagePlaneMemoryRequirementsInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImagePlaneMemoryRequirementsInfo_getPlaneAspect(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImagePlaneMemoryRequirementsInfo* o = (VkImagePlaneMemoryRequirementsInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->planeAspect);
}

void Java_cz_mg_vulkan_VkImagePlaneMemoryRequirementsInfo_setPlaneAspect(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImagePlaneMemoryRequirementsInfo* o = (VkImagePlaneMemoryRequirementsInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->planeAspect, valuePointer, sizeof(o->planeAspect));
}


