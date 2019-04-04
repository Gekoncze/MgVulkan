package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCompareOp.html">khronos documentation</a>
 **/
public class VulkanCompareOp extends VulkanEnum {
    public static final int NEVER = VkCompareOp.VK_COMPARE_OP_NEVER;
    public static final int LESS = VkCompareOp.VK_COMPARE_OP_LESS;
    public static final int EQUAL = VkCompareOp.VK_COMPARE_OP_EQUAL;
    public static final int LESS_OR_EQUAL = VkCompareOp.VK_COMPARE_OP_LESS_OR_EQUAL;
    public static final int GREATER = VkCompareOp.VK_COMPARE_OP_GREATER;
    public static final int NOT_EQUAL = VkCompareOp.VK_COMPARE_OP_NOT_EQUAL;
    public static final int GREATER_OR_EQUAL = VkCompareOp.VK_COMPARE_OP_GREATER_OR_EQUAL;
    public static final int ALWAYS = VkCompareOp.VK_COMPARE_OP_ALWAYS;

    public VulkanCompareOp(){
        super(new VkCompareOp());
    }

    public VulkanCompareOp(VkCompareOp vk){
        super(vk);
    }

    @Override
    public VkCompareOp getVk(){
        return (VkCompareOp) super.getVk();
    }

    public VulkanCompareOp(int value){
        super(new VkCompareOp(value));
    }

    @Override
    public String toString() {
        if(getValue() == NEVER) return "NEVER";
        if(getValue() == LESS) return "LESS";
        if(getValue() == EQUAL) return "EQUAL";
        if(getValue() == LESS_OR_EQUAL) return "LESS_OR_EQUAL";
        if(getValue() == GREATER) return "GREATER";
        if(getValue() == NOT_EQUAL) return "NOT_EQUAL";
        if(getValue() == GREATER_OR_EQUAL) return "GREATER_OR_EQUAL";
        if(getValue() == ALWAYS) return "ALWAYS";
        return "UNKNOWN";
    }

    public static class Array extends VulkanCompareOp implements cz.mg.collections.array.ReadonlyArray<VulkanCompareOp> {
        public Array(VkCompareOp.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCompareOp.Array(count));
        }

        public Array(int count, VulkanCompareOp o){
            this(new VkCompareOp.Array(count, o.getVk()));
        }

        @Override
        public VkCompareOp.Array getVk(){
            return (VkCompareOp.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCompareOp get(int i){
            return new VulkanCompareOp(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCompareOp.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCompareOp.Pointer());
        }

        public Pointer(long value) {
            this(new VkCompareOp.Pointer(value));
        }

        @Override
        public VkCompareOp.Pointer getVk(){
            return (VkCompareOp.Pointer) super.getVk();
        }

        public static class Array extends VulkanCompareOp.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCompareOp.Pointer> {
            public Array(int count) {
                super(new VkCompareOp.Pointer.Array(count));
            }

            public Array(VulkanCompareOp[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCompareOp.Pointer.Array getVk(){
                return (VkCompareOp.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCompareOp.Pointer get(int i){
                return new VulkanCompareOp.Pointer(getVk().get(i));
            }
        }
    }
}
