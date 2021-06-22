<?php
/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class THandleIdentifier
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'guid',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'secret',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $guid = null;
    /**
     * @var string
     */
    public $secret = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['guid'])) {
                $this->guid = $vals['guid'];
            }
            if (isset($vals['secret'])) {
                $this->secret = $vals['secret'];
            }
        }
    }

    public function getName()
    {
        return 'THandleIdentifier';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->guid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->secret);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('THandleIdentifier');
        if ($this->guid !== null) {
            $xfer += $output->writeFieldBegin('guid', TType::STRING, 1);
            $xfer += $output->writeString($this->guid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->secret !== null) {
            $xfer += $output->writeFieldBegin('secret', TType::STRING, 2);
            $xfer += $output->writeString($this->secret);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
