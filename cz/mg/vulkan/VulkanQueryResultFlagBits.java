package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryResultFlagBits.html">khronos documentation</a>
 **/
public class VulkanQueryResultFlagBits extends VulkanFlagBits {
    public static final int B64 = VkQueryResultFlagBits.VK_QUERY_RESULT_64_BIT;
    public static final int WAIT = VkQueryResultFlagBits.VK_QUERY_RESULT_WAIT_BIT;
    public static final int WITH_AVAILABILITY = VkQueryResultFlagBits.VK_QUERY_RESULT_WITH_AVAILABILITY_BIT;
    public static final int PARTIAL = VkQueryResultFlagBits.VK_QUERY_RESULT_PARTIAL_BIT;

    public VulkanQueryResultFlagBits(){
        super(new VkQueryResultFlagBits());
    }

    public VulkanQueryResultFlagBits(VkQueryResultFlagBits vk){
        super(vk);
    }

    @Override
    public VkQueryResultFlagBits getVk(){
        return (VkQueryResultFlagBits) super.getVk();
    }

    public VulkanQueryResultFlagBits(int value){
        super(new VkQueryResultFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == B64) s += "B64";
        if(getValue() == WAIT) s += "WAIT";
        if(getValue() == WITH_AVAILABILITY) s += "WITH_AVAILABILITY";
        if(getValue() == PARTIAL) s += "PARTIAL";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanQueryResultFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanQueryResultFlagBits> {
        public Array(VkQueryResultFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueryResultFlagBits.Array(count));
        }

        public Array(int count, VulkanQueryResultFlagBits o){
            this(new VkQueryResultFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkQueryResultFlagBits.Array getVk(){
            return (VkQueryResultFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueryResultFlagBits get(int i){
            return new VulkanQueryResultFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueryResultFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueryResultFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueryResultFlagBits.Pointer(value));
        }

        @Override
        public VkQueryResultFlagBits.Pointer getVk(){
            return (VkQueryResultFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueryResultFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueryResultFlagBits.Pointer> {
            public Array(int count) {
                super(new VkQueryResultFlagBits.Pointer.Array(count));
            }

            public Array(VulkanQueryResultFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueryResultFlagBits.Pointer.Array getVk(){
                return (VkQueryResultFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueryResultFlagBits.Pointer get(int i){
                return new VulkanQueryResultFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
