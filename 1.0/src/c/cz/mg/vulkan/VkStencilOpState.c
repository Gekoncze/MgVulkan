#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkStencilOpState_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkStencilOpState);
}

void Java_cz_mg_vulkan_VkStencilOpState_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkStencilOpState));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getFailOpNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->failOp);
}

void Java_cz_mg_vulkan_VkStencilOpState_setFailOpNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->failOp, valuePointer, sizeof(o->failOp));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getPassOpNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->passOp);
}

void Java_cz_mg_vulkan_VkStencilOpState_setPassOpNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->passOp, valuePointer, sizeof(o->passOp));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getDepthFailOpNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthFailOp);
}

void Java_cz_mg_vulkan_VkStencilOpState_setDepthFailOpNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthFailOp, valuePointer, sizeof(o->depthFailOp));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getCompareOpNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->compareOp);
}

void Java_cz_mg_vulkan_VkStencilOpState_setCompareOpNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compareOp, valuePointer, sizeof(o->compareOp));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getCompareMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->compareMask);
}

void Java_cz_mg_vulkan_VkStencilOpState_setCompareMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compareMask, valuePointer, sizeof(o->compareMask));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getWriteMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->writeMask);
}

void Java_cz_mg_vulkan_VkStencilOpState_setWriteMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->writeMask, valuePointer, sizeof(o->writeMask));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getReferenceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->reference);
}

void Java_cz_mg_vulkan_VkStencilOpState_setReferenceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->reference, valuePointer, sizeof(o->reference));
}


