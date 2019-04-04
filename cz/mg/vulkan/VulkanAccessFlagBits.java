package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAccessFlagBits.html">khronos documentation</a>
 **/
public class VulkanAccessFlagBits extends VulkanFlagBits {
    public static final int INDIRECT_COMMAND_READ = VkAccessFlagBits.VK_ACCESS_INDIRECT_COMMAND_READ_BIT;
    public static final int INDEX_READ = VkAccessFlagBits.VK_ACCESS_INDEX_READ_BIT;
    public static final int VERTEX_ATTRIBUTE_READ = VkAccessFlagBits.VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT;
    public static final int UNIFORM_READ = VkAccessFlagBits.VK_ACCESS_UNIFORM_READ_BIT;
    public static final int INPUT_ATTACHMENT_READ = VkAccessFlagBits.VK_ACCESS_INPUT_ATTACHMENT_READ_BIT;
    public static final int SHADER_READ = VkAccessFlagBits.VK_ACCESS_SHADER_READ_BIT;
    public static final int SHADER_WRITE = VkAccessFlagBits.VK_ACCESS_SHADER_WRITE_BIT;
    public static final int COLOR_ATTACHMENT_READ = VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_READ_BIT;
    public static final int COLOR_ATTACHMENT_WRITE = VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
    public static final int DEPTH_STENCIL_ATTACHMENT_READ = VkAccessFlagBits.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT;
    public static final int DEPTH_STENCIL_ATTACHMENT_WRITE = VkAccessFlagBits.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT;
    public static final int TRANSFER_READ = VkAccessFlagBits.VK_ACCESS_TRANSFER_READ_BIT;
    public static final int TRANSFER_WRITE = VkAccessFlagBits.VK_ACCESS_TRANSFER_WRITE_BIT;
    public static final int HOST_READ = VkAccessFlagBits.VK_ACCESS_HOST_READ_BIT;
    public static final int HOST_WRITE = VkAccessFlagBits.VK_ACCESS_HOST_WRITE_BIT;
    public static final int MEMORY_READ = VkAccessFlagBits.VK_ACCESS_MEMORY_READ_BIT;
    public static final int MEMORY_WRITE = VkAccessFlagBits.VK_ACCESS_MEMORY_WRITE_BIT;
    public static final int COMMAND_PROCESS_READ_NVX = VkAccessFlagBits.VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX;
    public static final int COMMAND_PROCESS_WRITE_NVX = VkAccessFlagBits.VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX;
    public static final int COLOR_ATTACHMENT_READ_NONCOHERENT_EXT = VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT;

    public VulkanAccessFlagBits(){
        super(new VkAccessFlagBits());
    }

    public VulkanAccessFlagBits(VkAccessFlagBits vk){
        super(vk);
    }

    @Override
    public VkAccessFlagBits getVk(){
        return (VkAccessFlagBits) super.getVk();
    }

    public VulkanAccessFlagBits(int value){
        super(new VkAccessFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == INDIRECT_COMMAND_READ) s += "INDIRECT_COMMAND_READ";
        if(getValue() == INDEX_READ) s += "INDEX_READ";
        if(getValue() == VERTEX_ATTRIBUTE_READ) s += "VERTEX_ATTRIBUTE_READ";
        if(getValue() == UNIFORM_READ) s += "UNIFORM_READ";
        if(getValue() == INPUT_ATTACHMENT_READ) s += "INPUT_ATTACHMENT_READ";
        if(getValue() == SHADER_READ) s += "SHADER_READ";
        if(getValue() == SHADER_WRITE) s += "SHADER_WRITE";
        if(getValue() == COLOR_ATTACHMENT_READ) s += "COLOR_ATTACHMENT_READ";
        if(getValue() == COLOR_ATTACHMENT_WRITE) s += "COLOR_ATTACHMENT_WRITE";
        if(getValue() == DEPTH_STENCIL_ATTACHMENT_READ) s += "DEPTH_STENCIL_ATTACHMENT_READ";
        if(getValue() == DEPTH_STENCIL_ATTACHMENT_WRITE) s += "DEPTH_STENCIL_ATTACHMENT_WRITE";
        if(getValue() == TRANSFER_READ) s += "TRANSFER_READ";
        if(getValue() == TRANSFER_WRITE) s += "TRANSFER_WRITE";
        if(getValue() == HOST_READ) s += "HOST_READ";
        if(getValue() == HOST_WRITE) s += "HOST_WRITE";
        if(getValue() == MEMORY_READ) s += "MEMORY_READ";
        if(getValue() == MEMORY_WRITE) s += "MEMORY_WRITE";
        if(getValue() == COMMAND_PROCESS_READ_NVX) s += "COMMAND_PROCESS_READ_NVX";
        if(getValue() == COMMAND_PROCESS_WRITE_NVX) s += "COMMAND_PROCESS_WRITE_NVX";
        if(getValue() == COLOR_ATTACHMENT_READ_NONCOHERENT_EXT) s += "COLOR_ATTACHMENT_READ_NONCOHERENT_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanAccessFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanAccessFlagBits> {
        public Array(VkAccessFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkAccessFlagBits.Array(count));
        }

        public Array(int count, VulkanAccessFlagBits o){
            this(new VkAccessFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkAccessFlagBits.Array getVk(){
            return (VkAccessFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanAccessFlagBits get(int i){
            return new VulkanAccessFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkAccessFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkAccessFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkAccessFlagBits.Pointer(value));
        }

        @Override
        public VkAccessFlagBits.Pointer getVk(){
            return (VkAccessFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanAccessFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanAccessFlagBits.Pointer> {
            public Array(int count) {
                super(new VkAccessFlagBits.Pointer.Array(count));
            }

            public Array(VulkanAccessFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkAccessFlagBits.Pointer.Array getVk(){
                return (VkAccessFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanAccessFlagBits.Pointer get(int i){
                return new VulkanAccessFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
